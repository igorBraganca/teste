import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-nota-senha',
  templateUrl: './nota-senha.component.html',
  styleUrls: ['./nota-senha.component.css']
})
export class NotaSenhaComponent implements OnInit {

  private nota = '0';

  constructor() {}

  ngOnInit() {}

  setNota(nota: number) {
    this.nota = '' + nota;
  }

  getNota(): string {
    return this.nota;
  }
}
