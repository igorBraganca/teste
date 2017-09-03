import {Senha} from '../entidades/senha';

import {Observable} from 'rxjs/Rx';
import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';



@Injectable()
export class MedidorSenhaService {

  constructor(private http: Http) {}

  getNota(password: string): Observable<Senha> {

    const bodyString = JSON.stringify(new Senha(password, 0));
    const headers = new Headers({'Content-Type': 'application/json'});
    const options = new RequestOptions({headers: headers});

    return this.http.post('/api/calcular', bodyString, options)
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }
}
