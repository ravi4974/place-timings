import { Weekday } from "../enums/weekday";

export interface Timing {
    id: number,
    start: String,
    end: String,
    weekday: Weekday
}
