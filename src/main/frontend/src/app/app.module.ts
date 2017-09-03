import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { MedidorSenhaComponent } from './medidor-senha/medidor-senha.component';
import { ComplexidadeSenhaComponent } from './complexidade-senha/complexidade-senha.component';
import { NotaSenhaComponent } from './nota-senha/nota-senha.component';

@NgModule({
  declarations: [
    AppComponent,
    MedidorSenhaComponent,
    ComplexidadeSenhaComponent,
    NotaSenhaComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
