package br.esp.abt.models.affiliation;

import java.util.Date;

import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;

@Endpoint(path = "/affiliations")
public class Affiliation {

    @Id
    private IdRef<Affiliation> id;
    
    private IdRef<AffiliatedGymn> yearAffiliation;
    
    private IdRef<Affiliate> affiliateId;
        
    private Date paymentConfirmationDate;
    
    public IdRef<Affiliation> getId() {
      return id;
    }

    public void setId(IdRef<Affiliation> id) {
      this.id = id;
    }

    public IdRef<AffiliatedGymn> getYearAffiliation() {
      return yearAffiliation;
    }

    public void setYearAffiliation(IdRef<AffiliatedGymn> yearAffiliation) {
      this.yearAffiliation = yearAffiliation;
    }

    public IdRef<Affiliate> getAffiliateId() {
      return affiliateId;
    }

    public void setAffiliateId(IdRef<Affiliate> affiliateId) {
      this.affiliateId = affiliateId;
    }

    public Date getPaymentConfirmationDate() {
      return paymentConfirmationDate;
    }

    public void setPaymentConfirmationDate(Date paymentConfirmationDate) {
      this.paymentConfirmationDate = paymentConfirmationDate;
    }
}
