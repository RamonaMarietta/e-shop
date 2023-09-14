import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/product';
import { environment } from 'src/environments/environment';

@Injectable()

export class ProductService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }
  httpOptions = {
    headers: new HttpHeaders({ 'Content-type': 'application/json', 'Access-Control-Allow-Origin': 'false' }
    )
  };
  public getProducts(): Observable<Product> {
    return this.http.get<Product>(`${this.apiServerUrl}/products/all`, this.httpOptions);
  }
  public addProduct(product: any): Observable<Product> {
    return this.http.post<Product>(`${this.apiServerUrl}/products/add`, product);
  }
  public updateProduct(product: Product): Observable<Product> {
    return this.http.put<Product>(`${this.apiServerUrl}/products/update`, product);
  }
  public deleteProduct(product: number): Observable<any> {
    return this.http.delete<Product>(`${this.apiServerUrl}/products/delete/$(productId)`);
  }
}
