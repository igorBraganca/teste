import {Senha} from '../entidades/senha';
import {MedidorSenhaService} from '../services/medidor-senha.service';

import {ViewChild, Component} from '@angular/core';

import {ComplexidadeSenhaComponent} from '../complexidade-senha/complexidade-senha.component';
import {NotaSenhaComponent} from '../nota-senha/nota-senha.component';

import {OnInit} from '@angular/core';
import {Observable} from 'rxjs';


@Component({
  selector: 'app-medidor-senha',
  templateUrl: './medidor-senha.component.html',
  styleUrls: ['./medidor-senha.component.css'],
  providers: [MedidorSenhaService]
})
export class MedidorSenhaComponent implements OnInit {

  @ViewChild(NotaSenhaComponent)
  private notaComponent: NotaSenhaComponent;

  @ViewChild(ComplexidadeSenhaComponent)
  private complexidadeComponent: ComplexidadeSenhaComponent;

  constructor(private service: MedidorSenhaService) {}

  ngOnInit() {}

  onChange(password: string) {
    this.service.getNota(password).subscribe(result => {
      this.notaComponent.setNota(result.nota);
      this.complexidadeComponent.setComplexidade(result.nota);
    }, error => {
      this.notaComponent.setNota(0);
      this.complexidadeComponent.setComplexidade(0);
      console.log(error);
    });
  }
}

