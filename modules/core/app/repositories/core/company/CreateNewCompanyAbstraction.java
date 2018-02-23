package repositories.core.company;

import models.core.company.CompanyModel;

import java.util.Optional;
import java.util.concurrent.CompletionStage;

public interface CreateNewCompanyAbstraction {

    CompletionStage<Optional<CompanyModel>> createNewCompany(CompanyModel companyModel);
}
