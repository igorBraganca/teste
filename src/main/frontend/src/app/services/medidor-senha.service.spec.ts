/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { MedidorSenhaService } from './medidor-senha.service';

describe('MedidorSenhaService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [MedidorSenhaService]
    });
  });

  it('should ...', inject([MedidorSenhaService], (service: MedidorSenhaService) => {
    expect(service).toBeTruthy();
  }));
});
