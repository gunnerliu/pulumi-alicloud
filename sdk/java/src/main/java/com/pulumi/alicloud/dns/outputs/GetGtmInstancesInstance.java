// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.alicloud.dns.outputs.GetGtmInstancesInstanceAlertConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGtmInstancesInstance {
    /**
     * @return The alert notification methods.
     * 
     */
    private List<GetGtmInstancesInstanceAlertConfig> alertConfigs;
    /**
     * @return The alert group.
     * 
     */
    private List<String> alertGroups;
    /**
     * @return The access type of the CNAME domain name.
     * 
     */
    private String cnameType;
    /**
     * @return The CreateTime of the Gtm Instance.
     * 
     */
    private String createTime;
    /**
     * @return The ExpireTime of the Gtm Instance.
     * 
     */
    private String expireTime;
    /**
     * @return The ID of the Gtm Instance.
     * 
     */
    private String id;
    /**
     * @return The ID of the Gtm Instance.
     * 
     */
    private String instanceId;
    /**
     * @return The name of the Gtm Instance.
     * 
     */
    private String instanceName;
    /**
     * @return The version of the instance.
     * 
     */
    private String packageEdition;
    /**
     * @return The paymentype of the resource.
     * 
     */
    private String paymentType;
    /**
     * @return The Public Network domain name access method.
     * 
     */
    private String publicCnameMode;
    /**
     * @return The CNAME access domain name.
     * 
     */
    private String publicRr;
    /**
     * @return The website domain name that the user uses on the Internet.
     * 
     */
    private String publicUserDomainName;
    /**
     * @return The domain name that is used to access GTM over the Internet.
     * 
     */
    private String publicZoneName;
    /**
     * @return The ID of the resource group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The type of the access policy.
     * 
     */
    private String strategyMode;
    /**
     * @return The global time to live.
     * 
     */
    private Integer ttl;

    private GetGtmInstancesInstance() {}
    /**
     * @return The alert notification methods.
     * 
     */
    public List<GetGtmInstancesInstanceAlertConfig> alertConfigs() {
        return this.alertConfigs;
    }
    /**
     * @return The alert group.
     * 
     */
    public List<String> alertGroups() {
        return this.alertGroups;
    }
    /**
     * @return The access type of the CNAME domain name.
     * 
     */
    public String cnameType() {
        return this.cnameType;
    }
    /**
     * @return The CreateTime of the Gtm Instance.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ExpireTime of the Gtm Instance.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return The ID of the Gtm Instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Gtm Instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The name of the Gtm Instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return The version of the instance.
     * 
     */
    public String packageEdition() {
        return this.packageEdition;
    }
    /**
     * @return The paymentype of the resource.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The Public Network domain name access method.
     * 
     */
    public String publicCnameMode() {
        return this.publicCnameMode;
    }
    /**
     * @return The CNAME access domain name.
     * 
     */
    public String publicRr() {
        return this.publicRr;
    }
    /**
     * @return The website domain name that the user uses on the Internet.
     * 
     */
    public String publicUserDomainName() {
        return this.publicUserDomainName;
    }
    /**
     * @return The domain name that is used to access GTM over the Internet.
     * 
     */
    public String publicZoneName() {
        return this.publicZoneName;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The type of the access policy.
     * 
     */
    public String strategyMode() {
        return this.strategyMode;
    }
    /**
     * @return The global time to live.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGtmInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGtmInstancesInstanceAlertConfig> alertConfigs;
        private List<String> alertGroups;
        private String cnameType;
        private String createTime;
        private String expireTime;
        private String id;
        private String instanceId;
        private String instanceName;
        private String packageEdition;
        private String paymentType;
        private String publicCnameMode;
        private String publicRr;
        private String publicUserDomainName;
        private String publicZoneName;
        private String resourceGroupId;
        private String strategyMode;
        private Integer ttl;
        public Builder() {}
        public Builder(GetGtmInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertConfigs = defaults.alertConfigs;
    	      this.alertGroups = defaults.alertGroups;
    	      this.cnameType = defaults.cnameType;
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.packageEdition = defaults.packageEdition;
    	      this.paymentType = defaults.paymentType;
    	      this.publicCnameMode = defaults.publicCnameMode;
    	      this.publicRr = defaults.publicRr;
    	      this.publicUserDomainName = defaults.publicUserDomainName;
    	      this.publicZoneName = defaults.publicZoneName;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.strategyMode = defaults.strategyMode;
    	      this.ttl = defaults.ttl;
        }

        @CustomType.Setter
        public Builder alertConfigs(List<GetGtmInstancesInstanceAlertConfig> alertConfigs) {
            this.alertConfigs = Objects.requireNonNull(alertConfigs);
            return this;
        }
        public Builder alertConfigs(GetGtmInstancesInstanceAlertConfig... alertConfigs) {
            return alertConfigs(List.of(alertConfigs));
        }
        @CustomType.Setter
        public Builder alertGroups(List<String> alertGroups) {
            this.alertGroups = Objects.requireNonNull(alertGroups);
            return this;
        }
        public Builder alertGroups(String... alertGroups) {
            return alertGroups(List.of(alertGroups));
        }
        @CustomType.Setter
        public Builder cnameType(String cnameType) {
            this.cnameType = Objects.requireNonNull(cnameType);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        @CustomType.Setter
        public Builder packageEdition(String packageEdition) {
            this.packageEdition = Objects.requireNonNull(packageEdition);
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        @CustomType.Setter
        public Builder publicCnameMode(String publicCnameMode) {
            this.publicCnameMode = Objects.requireNonNull(publicCnameMode);
            return this;
        }
        @CustomType.Setter
        public Builder publicRr(String publicRr) {
            this.publicRr = Objects.requireNonNull(publicRr);
            return this;
        }
        @CustomType.Setter
        public Builder publicUserDomainName(String publicUserDomainName) {
            this.publicUserDomainName = Objects.requireNonNull(publicUserDomainName);
            return this;
        }
        @CustomType.Setter
        public Builder publicZoneName(String publicZoneName) {
            this.publicZoneName = Objects.requireNonNull(publicZoneName);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder strategyMode(String strategyMode) {
            this.strategyMode = Objects.requireNonNull(strategyMode);
            return this;
        }
        @CustomType.Setter
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public GetGtmInstancesInstance build() {
            final var _resultValue = new GetGtmInstancesInstance();
            _resultValue.alertConfigs = alertConfigs;
            _resultValue.alertGroups = alertGroups;
            _resultValue.cnameType = cnameType;
            _resultValue.createTime = createTime;
            _resultValue.expireTime = expireTime;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.instanceName = instanceName;
            _resultValue.packageEdition = packageEdition;
            _resultValue.paymentType = paymentType;
            _resultValue.publicCnameMode = publicCnameMode;
            _resultValue.publicRr = publicRr;
            _resultValue.publicUserDomainName = publicUserDomainName;
            _resultValue.publicZoneName = publicZoneName;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.strategyMode = strategyMode;
            _resultValue.ttl = ttl;
            return _resultValue;
        }
    }
}
