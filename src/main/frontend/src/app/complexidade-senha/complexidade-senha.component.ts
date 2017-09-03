import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-complexidade-senha',
  templateUrl: './complexidade-senha.component.html',
  styleUrls: ['./complexidade-senha.component.css']
})
export class ComplexidadeSenhaComponent implements OnInit {

  private complexidade = 'Muito curta';

  constructor() {}

  ngOnInit() {}

  public setComplexidade(nota: number) {
    if (nota === 0) {
      this.complexidade = 'Muito curta';
    } else if (nota > 0 && nota < 20) {
      this.complexidade = 'Muito fraca';
    } else if (nota >= 20 && nota < 40) {
      this.complexidade = 'Fraca';
    } else if (nota >= 40 && nota < 60) {
      this.complexidade = 'Boa';
    } else if (nota >= 60 && nota < 80) {
      this.complexidade = 'Forte';
    } else {
      this.complexidade = 'Muito forte';
    }
  }

  public getComplexidade() {
    return this.complexidade;
  }
}
