
package ke.co.ipandasoft.jackpotsupdservice.models.fixturemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class FixturesResponseData implements Serializable
{

    @SerializedName("get")
    @Expose
    private String get;
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("results")
    @Expose
    private Integer results;
    @SerializedName("paging")
    @Expose
    private Paging paging;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;
    private final static long serialVersionUID = -2995980002337128115L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FixturesResponseData() {
    }

    /**
     * 
     * @param response
     * @param get
     * @param paging
     * @param parameters
     * @param results
     * @param errors
     */
    public FixturesResponseData(String get, Parameters parameters, List<Object> errors, Integer results, Paging paging, List<Response> response) {
        super();
        this.get = get;
        this.parameters = parameters;
        this.errors = errors;
        this.results = results;
        this.paging = paging;
        this.response = response;
    }

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

}
