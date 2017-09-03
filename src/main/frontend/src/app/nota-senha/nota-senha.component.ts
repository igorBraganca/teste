import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-nota-senha',
  templateUrl: './nota-senha.component.html',
  styleUrls: ['./nota-senha.component.css']
})
export class NotaSenhaComponent implements OnInit {

  nota: string = "0";

  constructor() {}

  ngOnInit() {
  }

}
