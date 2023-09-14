import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { OverviewComponent } from './product/overview/overview/overview.component';
import { ProductService } from './services/product-service.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { hrtime } from 'process';
import { OverviewdetailComponent } from './product/overview/overviewdetail/overviewdetail/overviewdetail.component';

@NgModule({
  declarations: [
    AppComponent,
    OverviewComponent,
    OverviewdetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers:
    [
      ProductService, HttpClient
    ],
  bootstrap: [AppComponent]
})
export class AppModule { }
