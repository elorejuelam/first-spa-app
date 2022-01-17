package co.dlighthouse.aem.firstspaapp.core.models;

import com.adobe.cq.export.json.ExporterConstants;
import com.adobe.cq.export.json.ComponentExporter;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = SlingHttpServletRequest.class,
        adapters = {ComponentExporter.class},
        resourceType = CardModel.RESOURCETYPE)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CardModel implements ComponentExporter{
    protected static final String RESOURCETYPE = "first-spa-app/components/card";
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    protected String text;        
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    protected String longText;

    public String getText(){
        return text;
    }
    public String getLongText(){
        return longText;
    }
    @Override
    public String getExportedType() {
        return RESOURCETYPE;
    }
}
