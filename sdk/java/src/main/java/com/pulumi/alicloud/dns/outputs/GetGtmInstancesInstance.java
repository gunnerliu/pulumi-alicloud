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
    private final List<GetGtmInstancesInstanceAlertConfig> alertConfigs;
    /**
     * @return The alert group.
     * 
     */
    private final List<String> alertGroups;
    /**
     * @return The access type of the CNAME domain name.
     * 
     */
    private final String cnameType;
    /**
     * @return The CreateTime of the Gtm Instance.
     * 
     */
    private final String createTime;
    /**
     * @return The ExpireTime of the Gtm Instance.
     * 
     */
    private final String expireTime;
    /**
     * @return The ID of the Gtm Instance.
     * 
     */
    private final String id;
    /**
     * @return The ID of the Gtm Instance.
     * 
     */
    private final String instanceId;
    /**
     * @return The name of the Gtm Instance.
     * 
     */
    private final String instanceName;
    /**
     * @return The version of the instance.
     * 
     */
    private final String packageEdition;
    /**
     * @return The paymentype of the resource.
     * 
     */
    private final String paymentType;
    /**
     * @return The Public Network domain name access method.
     * 
     */
    private final String publicCnameMode;
    /**
     * @return The CNAME access domain name.
     * 
     */
    private final String publicRr;
    /**
     * @return The website domain name that the user uses on the Internet.
     * 
     */
    private final String publicUserDomainName;
    /**
     * @return The domain name that is used to access GTM over the Internet.
     * 
     */
    private final String publicZoneName;
    /**
     * @return The ID of the resource group.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return The type of the access policy.
     * 
     */
    private final String strategyMode;
    /**
     * @return The global time to live.
     * 
     */
    private final Integer ttl;

    @CustomType.Constructor
    private GetGtmInstancesInstance(
        @CustomType.Parameter("alertConfigs") List<GetGtmInstancesInstanceAlertConfig> alertConfigs,
        @CustomType.Parameter("alertGroups") List<String> alertGroups,
        @CustomType.Parameter("cnameType") String cnameType,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("instanceName") String instanceName,
        @CustomType.Parameter("packageEdition") String packageEdition,
        @CustomType.Parameter("paymentType") String paymentType,
        @CustomType.Parameter("publicCnameMode") String publicCnameMode,
        @CustomType.Parameter("publicRr") String publicRr,
        @CustomType.Parameter("publicUserDomainName") String publicUserDomainName,
        @CustomType.Parameter("publicZoneName") String publicZoneName,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("strategyMode") String strategyMode,
        @CustomType.Parameter("ttl") Integer ttl) {
        this.alertConfigs = alertConfigs;
        this.alertGroups = alertGroups;
        this.cnameType = cnameType;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.id = id;
        this.instanceId = instanceId;
        this.instanceName = instanceName;
        this.packageEdition = packageEdition;
        this.paymentType = paymentType;
        this.publicCnameMode = publicCnameMode;
        this.publicRr = publicRr;
        this.publicUserDomainName = publicUserDomainName;
        this.publicZoneName = publicZoneName;
        this.resourceGroupId = resourceGroupId;
        this.strategyMode = strategyMode;
        this.ttl = ttl;
    }

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

        public Builder() {
    	      // Empty
        }

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

        public Builder alertConfigs(List<GetGtmInstancesInstanceAlertConfig> alertConfigs) {
            this.alertConfigs = Objects.requireNonNull(alertConfigs);
            return this;
        }
        public Builder alertConfigs(GetGtmInstancesInstanceAlertConfig... alertConfigs) {
            return alertConfigs(List.of(alertConfigs));
        }
        public Builder alertGroups(List<String> alertGroups) {
            this.alertGroups = Objects.requireNonNull(alertGroups);
            return this;
        }
        public Builder alertGroups(String... alertGroups) {
            return alertGroups(List.of(alertGroups));
        }
        public Builder cnameType(String cnameType) {
            this.cnameType = Objects.requireNonNull(cnameType);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder packageEdition(String packageEdition) {
            this.packageEdition = Objects.requireNonNull(packageEdition);
            return this;
        }
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        public Builder publicCnameMode(String publicCnameMode) {
            this.publicCnameMode = Objects.requireNonNull(publicCnameMode);
            return this;
        }
        public Builder publicRr(String publicRr) {
            this.publicRr = Objects.requireNonNull(publicRr);
            return this;
        }
        public Builder publicUserDomainName(String publicUserDomainName) {
            this.publicUserDomainName = Objects.requireNonNull(publicUserDomainName);
            return this;
        }
        public Builder publicZoneName(String publicZoneName) {
            this.publicZoneName = Objects.requireNonNull(publicZoneName);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder strategyMode(String strategyMode) {
            this.strategyMode = Objects.requireNonNull(strategyMode);
            return this;
        }
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }        public GetGtmInstancesInstance build() {
            return new GetGtmInstancesInstance(alertConfigs, alertGroups, cnameType, createTime, expireTime, id, instanceId, instanceName, packageEdition, paymentType, publicCnameMode, publicRr, publicUserDomainName, publicZoneName, resourceGroupId, strategyMode, ttl);
        }
    }
}
