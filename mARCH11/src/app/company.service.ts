import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Company } from './models/companies';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CompanyService {
  
  httpUrl='http://localhost:8765/company-service/companies/';
  constructor(private httpClient: HttpClient,@Inject(HttpClient) private ht) { }
  getAllCompanies(): Observable<Company[]> {
    return this.httpClient.get<Company[]>(this.httpUrl);
  }
  saveCompany(company:Company):Observable<Company>{
    return this.ht.post(this.httpUrl, company);
  }
  deleteCompany(id:number):Observable<Company>{
    return this.ht.delete(`http://localhost:8765/company-service/companies/${id}`);
  }
  updateCompanyInfo(company :Company):Observable<Company>{
    return this.ht.put(`http://localhost:8765/company-service/companies` , company);
  }
  getCompanyById(id :number):Observable<Company>{
    return this.ht.get(`http://localhost:8765/company-service/companies/${id}`);
  }
}