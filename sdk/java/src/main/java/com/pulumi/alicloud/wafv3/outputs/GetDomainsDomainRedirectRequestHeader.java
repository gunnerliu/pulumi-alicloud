// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.wafv3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainsDomainRedirectRequestHeader {
    /**
     * @return The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is **[{&#34; k &#34;:&#34;_key_&#34;,&#34; v &#34;:&#34;_value_&#34;}]**. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.
     * 
     */
    private final String key;
    /**
     * @return The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is **[{&#34; k &#34;:&#34;_key_&#34;,&#34; v &#34;:&#34;_value_&#34;}]**. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetDomainsDomainRedirectRequestHeader(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is **[{&#34; k &#34;:&#34;_key_&#34;,&#34; v &#34;:&#34;_value_&#34;}]**. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is **[{&#34; k &#34;:&#34;_key_&#34;,&#34; v &#34;:&#34;_value_&#34;}]**. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainsDomainRedirectRequestHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainsDomainRedirectRequestHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetDomainsDomainRedirectRequestHeader build() {
            return new GetDomainsDomainRedirectRequestHeader(key, value);
        }
    }
}
