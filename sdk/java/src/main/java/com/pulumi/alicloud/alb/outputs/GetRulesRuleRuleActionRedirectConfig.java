// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesRuleRuleActionRedirectConfig {
    /**
     * @return The host name of the destination to which requests are redirected within ALB.  Valid values:  The host name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?). The host name must contain at least one period (.), and cannot start or end with a period (.). The rightmost domain label can contain only letters, asterisks (*) and question marks (?) and cannot contain digits or hyphens (-). Other domain labels cannot start or end with a hyphen (-). You can include asterisks (*) and question marks (?) anywhere in a domain label. Default value: ${host}. You cannot use this value with other characters at the same time.
     * 
     */
    private String host;
    /**
     * @return The redirect method. Valid values:301, 302, 303, 307, and 308.
     * 
     */
    private String httpCode;
    /**
     * @return The path to which requests are to be redirected within ALB.  Valid values: The path must be 1 to 128 characters in length, and start with a forward slash (/). The path can contain letters, digits, asterisks (*), question marks (?)and the following special characters: $ - _ . + / &amp; ~ @ :. It cannot contain the following special characters: &#34; % # ; ! ( ) [ ] ^ , ”. The path is case-sensitive.  Default value: ${path}. This value can be used only once. You can use it with a valid string.
     * 
     */
    private String path;
    /**
     * @return The port of the destination to which requests are redirected.  Valid values: 1 to 63335.  Default value: ${port}. You cannot use this value together with other characters at the same time.
     * 
     */
    private String port;
    /**
     * @return The protocol of the requests to be redirected.  Valid values: HTTP and HTTPS.  Default value: ${protocol}. You cannot use this value together with other characters at the same time.  Note HTTPS listeners can redirect only HTTPS requests.
     * 
     */
    private String protocol;
    /**
     * @return The query string of the request to be redirected within ALB.  The query string must be 1 to 128 characters in length, can contain letters and printable characters. It cannot contain the following special characters: # [ ] { } \ | &lt; &gt; &amp;.  Default value: ${query}. This value can be used only once. You can use it with a valid string.
     * 
     */
    private String query;

    private GetRulesRuleRuleActionRedirectConfig() {}
    /**
     * @return The host name of the destination to which requests are redirected within ALB.  Valid values:  The host name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), periods (.), asterisks (*), and question marks (?). The host name must contain at least one period (.), and cannot start or end with a period (.). The rightmost domain label can contain only letters, asterisks (*) and question marks (?) and cannot contain digits or hyphens (-). Other domain labels cannot start or end with a hyphen (-). You can include asterisks (*) and question marks (?) anywhere in a domain label. Default value: ${host}. You cannot use this value with other characters at the same time.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The redirect method. Valid values:301, 302, 303, 307, and 308.
     * 
     */
    public String httpCode() {
        return this.httpCode;
    }
    /**
     * @return The path to which requests are to be redirected within ALB.  Valid values: The path must be 1 to 128 characters in length, and start with a forward slash (/). The path can contain letters, digits, asterisks (*), question marks (?)and the following special characters: $ - _ . + / &amp; ~ @ :. It cannot contain the following special characters: &#34; % # ; ! ( ) [ ] ^ , ”. The path is case-sensitive.  Default value: ${path}. This value can be used only once. You can use it with a valid string.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The port of the destination to which requests are redirected.  Valid values: 1 to 63335.  Default value: ${port}. You cannot use this value together with other characters at the same time.
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return The protocol of the requests to be redirected.  Valid values: HTTP and HTTPS.  Default value: ${protocol}. You cannot use this value together with other characters at the same time.  Note HTTPS listeners can redirect only HTTPS requests.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The query string of the request to be redirected within ALB.  The query string must be 1 to 128 characters in length, can contain letters and printable characters. It cannot contain the following special characters: # [ ] { } \ | &lt; &gt; &amp;.  Default value: ${query}. This value can be used only once. You can use it with a valid string.
     * 
     */
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRuleRuleActionRedirectConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private String httpCode;
        private String path;
        private String port;
        private String protocol;
        private String query;
        public Builder() {}
        public Builder(GetRulesRuleRuleActionRedirectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.httpCode = defaults.httpCode;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        @CustomType.Setter
        public Builder httpCode(String httpCode) {
            this.httpCode = Objects.requireNonNull(httpCode);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public GetRulesRuleRuleActionRedirectConfig build() {
            final var _resultValue = new GetRulesRuleRuleActionRedirectConfig();
            _resultValue.host = host;
            _resultValue.httpCode = httpCode;
            _resultValue.path = path;
            _resultValue.port = port;
            _resultValue.protocol = protocol;
            _resultValue.query = query;
            return _resultValue;
        }
    }
}
