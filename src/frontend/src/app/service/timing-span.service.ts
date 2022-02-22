import { Injectable } from '@angular/core';
import { Timing } from '../interface/timing';
import { TimingSpan } from '../interface/timing-span';

@Injectable({
  providedIn: 'root'
})
export class TimingSpanService {

  constructor() { }

  private getTimeRangeString(timing: Timing): string {
    return timing["start"].substring(11, 16) + "-" + timing["end"].substring(11, 16)
  }

  getWeekdaysByTimeRange(timings: Timing[]): any {
    let uniqueTimeRange: any = {};
    timings.forEach(x => { let t: string = this.getTimeRangeString(x); uniqueTimeRange[t] = uniqueTimeRange[t] || []; uniqueTimeRange[t].push(x["weekday"]) });
    return uniqueTimeRange
  }

  getTimingSpan(timings: Timing[]): TimingSpan[] {
    let weekdaysByTimeRange = this.getWeekdaysByTimeRange(timings)
    let weekdays = ["MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"]
    let closedDays = new Set(weekdays)

    let uniqueTimeSpan: any = {}
    for (let tr in weekdaysByTimeRange) {
      let days = weekdaysByTimeRange[tr].sort((x: string, y: string) => { return weekdays.indexOf(x) - weekdays.indexOf(y) })
      let day_span = [], seq = [], last = -1
      for (let day of days.entries()) {
        closedDays.delete(day[1])
        if (last >= 0 && day[1] != weekdays[last + 1] && weekdays.length - 1 > last) {
          day_span.push(seq.length > 1 ? [seq[0], seq[seq.length - 1]] : seq)
          seq = []
        }
        last = weekdays.indexOf(day[1])
        seq.push(day[1])
      }
      if (seq.length)
        day_span.push(seq.length > 1 ? [seq[0], seq[seq.length - 1]] : seq)

      day_span.forEach(x => { let k: string = x.join('-'); uniqueTimeSpan[k] = uniqueTimeSpan[k] || []; uniqueTimeSpan[k].push(tr) });
    }
    for (let day of closedDays) uniqueTimeSpan[day] = ["Closed"]

    let orderedTimings = Object.keys(uniqueTimeSpan).sort((x, y) => { x = x.split('-')[0]; y = y.split('-')[0]; return weekdays.indexOf(x) - weekdays.indexOf(y) })

    return orderedTimings.map((x: string) => {
      return {
        span: x,
        timings: uniqueTimeSpan[x]
      }
    })
  }
}
