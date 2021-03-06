
package cs.ut.domain.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cs.ut.domain.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreatePurchaseOrder_QNAME = new QName("http://web.soap.domain.ut.cs/", "CreatePurchaseOrder");
    private final static QName _Plant_QNAME = new QName("http://web.soap.domain.ut.cs/", "plant");
    private final static QName _GetAllPlants_QNAME = new QName("http://web.soap.domain.ut.cs/", "getAllPlants");
    private final static QName _CreatePurchaseOrderResponse_QNAME = new QName("http://web.soap.domain.ut.cs/", "CreatePurchaseOrderResponse");
    private final static QName _GetAllPlantsResponse_QNAME = new QName("http://web.soap.domain.ut.cs/", "getAllPlantsResponse");
    private final static QName _Plants_QNAME = new QName("http://web.soap.domain.ut.cs/", "plants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cs.ut.domain.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlantResource }
     * 
     */
    public PlantResource createPlantResource() {
        return new PlantResource();
    }

    /**
     * Create an instance of {@link CreatePurchaseOrder }
     * 
     */
    public CreatePurchaseOrder createCreatePurchaseOrder() {
        return new CreatePurchaseOrder();
    }

    /**
     * Create an instance of {@link PlantResourceList }
     * 
     */
    public PlantResourceList createPlantResourceList() {
        return new PlantResourceList();
    }

    /**
     * Create an instance of {@link GetAllPlantsResponse }
     * 
     */
    public GetAllPlantsResponse createGetAllPlantsResponse() {
        return new GetAllPlantsResponse();
    }

    /**
     * Create an instance of {@link CreatePurchaseOrderResponse }
     * 
     */
    public CreatePurchaseOrderResponse createCreatePurchaseOrderResponse() {
        return new CreatePurchaseOrderResponse();
    }

    /**
     * Create an instance of {@link GetAllPlants }
     * 
     */
    public GetAllPlants createGetAllPlants() {
        return new GetAllPlants();
    }

    /**
     * Create an instance of {@link PurchaseOrderResource }
     * 
     */
    public PurchaseOrderResource createPurchaseOrderResource() {
        return new PurchaseOrderResource();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.domain.ut.cs/", name = "CreatePurchaseOrder")
    public JAXBElement<CreatePurchaseOrder> createCreatePurchaseOrder(CreatePurchaseOrder value) {
        return new JAXBElement<CreatePurchaseOrder>(_CreatePurchaseOrder_QNAME, CreatePurchaseOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlantResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.domain.ut.cs/", name = "plant")
    public JAXBElement<PlantResource> createPlant(PlantResource value) {
        return new JAXBElement<PlantResource>(_Plant_QNAME, PlantResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPlants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.domain.ut.cs/", name = "getAllPlants")
    public JAXBElement<GetAllPlants> createGetAllPlants(GetAllPlants value) {
        return new JAXBElement<GetAllPlants>(_GetAllPlants_QNAME, GetAllPlants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePurchaseOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.domain.ut.cs/", name = "CreatePurchaseOrderResponse")
    public JAXBElement<CreatePurchaseOrderResponse> createCreatePurchaseOrderResponse(CreatePurchaseOrderResponse value) {
        return new JAXBElement<CreatePurchaseOrderResponse>(_CreatePurchaseOrderResponse_QNAME, CreatePurchaseOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPlantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.domain.ut.cs/", name = "getAllPlantsResponse")
    public JAXBElement<GetAllPlantsResponse> createGetAllPlantsResponse(GetAllPlantsResponse value) {
        return new JAXBElement<GetAllPlantsResponse>(_GetAllPlantsResponse_QNAME, GetAllPlantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlantResourceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.soap.domain.ut.cs/", name = "plants")
    public JAXBElement<PlantResourceList> createPlants(PlantResourceList value) {
        return new JAXBElement<PlantResourceList>(_Plants_QNAME, PlantResourceList.class, null, value);
    }

}
