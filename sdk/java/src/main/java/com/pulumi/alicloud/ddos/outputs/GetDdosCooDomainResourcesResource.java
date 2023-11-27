// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.outputs;

import com.pulumi.alicloud.ddos.outputs.GetDdosCooDomainResourcesResourceProxyType;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDdosCooDomainResourcesResource {
    /**
     * @return The IP addresses in the blacklist for the domain name.
     * 
     */
    private List<String> blackLists;
    /**
     * @return Whether frequency control guard (CC guard) is enabled. Values: `True`: Opened, `False`: Not enabled.
     * 
     */
    private Boolean ccEnabled;
    /**
     * @return Whether custom frequency control guard (CC guard) is enabled. Values: `True`: Opened, `False`: Not enabled.
     * 
     */
    private Boolean ccRuleEnabled;
    /**
     * @return The mode of the Frequency Control policy.
     * 
     */
    private String ccTemplate;
    /**
     * @return The name of the certificate.
     * 
     */
    private String certName;
    /**
     * @return The domain name of the website that you want to add to the instance.
     * 
     */
    private String domain;
    /**
     * @return Whether Http2.0 is enabled.
     * 
     */
    private Boolean http2Enable;
    /**
     * @return The advanced HTTPS settings.
     * 
     */
    private String httpsExt;
    /**
     * @return The ID of the Domain Resource.
     * 
     */
    private String id;
    /**
     * @return A list ID of instance that you want to associate.
     * 
     */
    private List<String> instanceIds;
    /**
     * @return The type of backload algorithm.
     * 
     */
    private String policyMode;
    /**
     * @return Whether the website service forwarding rules have been turned on.
     * 
     */
    private Boolean proxyEnabled;
    /**
     * @return Protocol type and port number information.
     * 
     */
    private List<GetDdosCooDomainResourcesResourceProxyType> proxyTypes;
    /**
     * @return Server address information of the source station.
     * 
     */
    private List<String> realServers;
    /**
     * @return Server address type.
     * 
     */
    private Integer rsType;
    /**
     * @return The type of the cipher suite.
     * 
     */
    private String sslCiphers;
    /**
     * @return The version of the TLS protocol.
     * 
     */
    private String sslProtocols;
    /**
     * @return The IP addresses in the whitelist for the domain name.
     * 
     */
    private List<String> whiteLists;

    private GetDdosCooDomainResourcesResource() {}
    /**
     * @return The IP addresses in the blacklist for the domain name.
     * 
     */
    public List<String> blackLists() {
        return this.blackLists;
    }
    /**
     * @return Whether frequency control guard (CC guard) is enabled. Values: `True`: Opened, `False`: Not enabled.
     * 
     */
    public Boolean ccEnabled() {
        return this.ccEnabled;
    }
    /**
     * @return Whether custom frequency control guard (CC guard) is enabled. Values: `True`: Opened, `False`: Not enabled.
     * 
     */
    public Boolean ccRuleEnabled() {
        return this.ccRuleEnabled;
    }
    /**
     * @return The mode of the Frequency Control policy.
     * 
     */
    public String ccTemplate() {
        return this.ccTemplate;
    }
    /**
     * @return The name of the certificate.
     * 
     */
    public String certName() {
        return this.certName;
    }
    /**
     * @return The domain name of the website that you want to add to the instance.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return Whether Http2.0 is enabled.
     * 
     */
    public Boolean http2Enable() {
        return this.http2Enable;
    }
    /**
     * @return The advanced HTTPS settings.
     * 
     */
    public String httpsExt() {
        return this.httpsExt;
    }
    /**
     * @return The ID of the Domain Resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list ID of instance that you want to associate.
     * 
     */
    public List<String> instanceIds() {
        return this.instanceIds;
    }
    /**
     * @return The type of backload algorithm.
     * 
     */
    public String policyMode() {
        return this.policyMode;
    }
    /**
     * @return Whether the website service forwarding rules have been turned on.
     * 
     */
    public Boolean proxyEnabled() {
        return this.proxyEnabled;
    }
    /**
     * @return Protocol type and port number information.
     * 
     */
    public List<GetDdosCooDomainResourcesResourceProxyType> proxyTypes() {
        return this.proxyTypes;
    }
    /**
     * @return Server address information of the source station.
     * 
     */
    public List<String> realServers() {
        return this.realServers;
    }
    /**
     * @return Server address type.
     * 
     */
    public Integer rsType() {
        return this.rsType;
    }
    /**
     * @return The type of the cipher suite.
     * 
     */
    public String sslCiphers() {
        return this.sslCiphers;
    }
    /**
     * @return The version of the TLS protocol.
     * 
     */
    public String sslProtocols() {
        return this.sslProtocols;
    }
    /**
     * @return The IP addresses in the whitelist for the domain name.
     * 
     */
    public List<String> whiteLists() {
        return this.whiteLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDdosCooDomainResourcesResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> blackLists;
        private Boolean ccEnabled;
        private Boolean ccRuleEnabled;
        private String ccTemplate;
        private String certName;
        private String domain;
        private Boolean http2Enable;
        private String httpsExt;
        private String id;
        private List<String> instanceIds;
        private String policyMode;
        private Boolean proxyEnabled;
        private List<GetDdosCooDomainResourcesResourceProxyType> proxyTypes;
        private List<String> realServers;
        private Integer rsType;
        private String sslCiphers;
        private String sslProtocols;
        private List<String> whiteLists;
        public Builder() {}
        public Builder(GetDdosCooDomainResourcesResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blackLists = defaults.blackLists;
    	      this.ccEnabled = defaults.ccEnabled;
    	      this.ccRuleEnabled = defaults.ccRuleEnabled;
    	      this.ccTemplate = defaults.ccTemplate;
    	      this.certName = defaults.certName;
    	      this.domain = defaults.domain;
    	      this.http2Enable = defaults.http2Enable;
    	      this.httpsExt = defaults.httpsExt;
    	      this.id = defaults.id;
    	      this.instanceIds = defaults.instanceIds;
    	      this.policyMode = defaults.policyMode;
    	      this.proxyEnabled = defaults.proxyEnabled;
    	      this.proxyTypes = defaults.proxyTypes;
    	      this.realServers = defaults.realServers;
    	      this.rsType = defaults.rsType;
    	      this.sslCiphers = defaults.sslCiphers;
    	      this.sslProtocols = defaults.sslProtocols;
    	      this.whiteLists = defaults.whiteLists;
        }

        @CustomType.Setter
        public Builder blackLists(List<String> blackLists) {
            this.blackLists = Objects.requireNonNull(blackLists);
            return this;
        }
        public Builder blackLists(String... blackLists) {
            return blackLists(List.of(blackLists));
        }
        @CustomType.Setter
        public Builder ccEnabled(Boolean ccEnabled) {
            this.ccEnabled = Objects.requireNonNull(ccEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder ccRuleEnabled(Boolean ccRuleEnabled) {
            this.ccRuleEnabled = Objects.requireNonNull(ccRuleEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder ccTemplate(String ccTemplate) {
            this.ccTemplate = Objects.requireNonNull(ccTemplate);
            return this;
        }
        @CustomType.Setter
        public Builder certName(String certName) {
            this.certName = Objects.requireNonNull(certName);
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder http2Enable(Boolean http2Enable) {
            this.http2Enable = Objects.requireNonNull(http2Enable);
            return this;
        }
        @CustomType.Setter
        public Builder httpsExt(String httpsExt) {
            this.httpsExt = Objects.requireNonNull(httpsExt);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceIds(List<String> instanceIds) {
            this.instanceIds = Objects.requireNonNull(instanceIds);
            return this;
        }
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
        }
        @CustomType.Setter
        public Builder policyMode(String policyMode) {
            this.policyMode = Objects.requireNonNull(policyMode);
            return this;
        }
        @CustomType.Setter
        public Builder proxyEnabled(Boolean proxyEnabled) {
            this.proxyEnabled = Objects.requireNonNull(proxyEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder proxyTypes(List<GetDdosCooDomainResourcesResourceProxyType> proxyTypes) {
            this.proxyTypes = Objects.requireNonNull(proxyTypes);
            return this;
        }
        public Builder proxyTypes(GetDdosCooDomainResourcesResourceProxyType... proxyTypes) {
            return proxyTypes(List.of(proxyTypes));
        }
        @CustomType.Setter
        public Builder realServers(List<String> realServers) {
            this.realServers = Objects.requireNonNull(realServers);
            return this;
        }
        public Builder realServers(String... realServers) {
            return realServers(List.of(realServers));
        }
        @CustomType.Setter
        public Builder rsType(Integer rsType) {
            this.rsType = Objects.requireNonNull(rsType);
            return this;
        }
        @CustomType.Setter
        public Builder sslCiphers(String sslCiphers) {
            this.sslCiphers = Objects.requireNonNull(sslCiphers);
            return this;
        }
        @CustomType.Setter
        public Builder sslProtocols(String sslProtocols) {
            this.sslProtocols = Objects.requireNonNull(sslProtocols);
            return this;
        }
        @CustomType.Setter
        public Builder whiteLists(List<String> whiteLists) {
            this.whiteLists = Objects.requireNonNull(whiteLists);
            return this;
        }
        public Builder whiteLists(String... whiteLists) {
            return whiteLists(List.of(whiteLists));
        }
        public GetDdosCooDomainResourcesResource build() {
            final var _resultValue = new GetDdosCooDomainResourcesResource();
            _resultValue.blackLists = blackLists;
            _resultValue.ccEnabled = ccEnabled;
            _resultValue.ccRuleEnabled = ccRuleEnabled;
            _resultValue.ccTemplate = ccTemplate;
            _resultValue.certName = certName;
            _resultValue.domain = domain;
            _resultValue.http2Enable = http2Enable;
            _resultValue.httpsExt = httpsExt;
            _resultValue.id = id;
            _resultValue.instanceIds = instanceIds;
            _resultValue.policyMode = policyMode;
            _resultValue.proxyEnabled = proxyEnabled;
            _resultValue.proxyTypes = proxyTypes;
            _resultValue.realServers = realServers;
            _resultValue.rsType = rsType;
            _resultValue.sslCiphers = sslCiphers;
            _resultValue.sslProtocols = sslProtocols;
            _resultValue.whiteLists = whiteLists;
            return _resultValue;
        }
    }
}
