import { TestBed } from '@angular/core/testing';

import { TimingSpanService } from './timing-span.service';

describe('TimingSpanService', () => {
  let service: TimingSpanService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TimingSpanService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
