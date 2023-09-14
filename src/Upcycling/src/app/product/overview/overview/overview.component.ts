import { Component } from '@angular/core';
import { ProductService } from 'src/app/services/product-service.service';

@Component({
  selector: 'products-overview',
  templateUrl: './overview.component.html',
  styleUrls: ['./overview.component.css']
})

export class OverviewComponent {
  public productSource = [];
  constructor(private service: ProductService) {
    var prod = service.getProducts();
    prod.subscribe(
      (data) => {
        console.log(data);
        this.productSource = data as any;
      }
    );
  };
}
