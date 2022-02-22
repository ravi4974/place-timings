import { Timing } from "./timing";

export interface Place {
    id:number,
    label: String,
    address: String,
    timings: Timing[]
}
