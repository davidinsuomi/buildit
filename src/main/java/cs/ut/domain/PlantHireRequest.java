package cs.ut.domain;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class PlantHireRequest {

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    @NotNull
    private Date startDate;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    @NotNull
    private Date endDate;

    /**
     */
    @NotNull
    private BigDecimal totalCost;

    /**
     */
    @ManyToOne
    @NotNull
    private SiteEngineer siteEngineer;

    private int plantId;

    /**
     */
    @ManyToOne
    @NotNull
    private Site site;

    /**
     */
    @ManyToOne
    private Supplier supplier;
    
    @Enumerated
    ApprovalStatus status;
}
