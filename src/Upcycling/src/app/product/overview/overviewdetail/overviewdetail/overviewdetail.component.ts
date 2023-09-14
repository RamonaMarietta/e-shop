import { Component, Input } from '@angular/core';
import { Product } from 'src/app/models/product';
import { NgOptimizedImage } from '@angular/common';

@Component({
  selector: 'app-overviewdetail',
  templateUrl: './overviewdetail.component.html',
  styleUrls: ['./overviewdetail.component.css']
})

export class OverviewdetailComponent {


  @Input() public product!: Product;

}
