import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OverviewdetailComponent } from './overviewdetail.component';

describe('OverviewdetailComponent', () => {
  let component: OverviewdetailComponent;
  let fixture: ComponentFixture<OverviewdetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OverviewdetailComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OverviewdetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
