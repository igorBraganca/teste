import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-complexidade-senha',
  templateUrl: './complexidade-senha.component.html',
  styleUrls: ['./complexidade-senha.component.css']
})
export class ComplexidadeSenhaComponent implements OnInit {

  complexidade: string = "Muito curta";

  constructor() {}

  ngOnInit() {
  }

}
