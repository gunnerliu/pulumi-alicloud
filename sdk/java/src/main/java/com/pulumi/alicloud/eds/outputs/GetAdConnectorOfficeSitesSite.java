// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.alicloud.eds.outputs.GetAdConnectorOfficeSitesSiteAdConnector;
import com.pulumi.alicloud.eds.outputs.GetAdConnectorOfficeSitesSiteLog;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAdConnectorOfficeSitesSite {
    /**
     * @return The Name of the ad connector office site.
     * 
     */
    private final String adConnectorOfficeSiteName;
    /**
     * @return AD Connector Collection of Information.
     * 
     */
    private final List<GetAdConnectorOfficeSitesSiteAdConnector> adConnectors;
    /**
     * @return The Internet Bandwidth Peak. Possible Values: 0~200. If This Field Is Set to 0, Indicates That There Is No Open Internet Access.
     * 
     */
    private final Integer bandwidth;
    /**
     * @return Cloud Enterprise Network Instance Id.
     * 
     */
    private final String cenId;
    /**
     * @return Workspace Corresponds to the Security Office Network of IPv4 Segment.
     * 
     */
    private final String cidrBlock;
    /**
     * @return Workspace Creation Time.
     * 
     */
    private final String createTime;
    /**
     * @return Security Group ID.
     * 
     */
    private final String customSecurityGroupId;
    /**
     * @return The method that is used to connect the client to cloud desktops.
     * 
     */
    private final String desktopAccessType;
    /**
     * @return The endpoint that is used to connect to cloud desktops over a VPC.
     * 
     */
    private final String desktopVpcEndpoint;
    /**
     * @return Enterprise Ad Corresponding DNS Address.
     * 
     */
    private final List<String> dnsAddresses;
    /**
     * @return The Easy-to-Use DNS Name.
     * 
     */
    private final String dnsUserName;
    /**
     * @return Enterprise of Ad Domain Name.
     * 
     */
    private final String domainName;
    /**
     * @return The Domain Administrator&#39;s Username.
     * 
     */
    private final String domainUserName;
    /**
     * @return Whether to Use Cloud Desktop User Empowerment of Local Administrator Permissions.
     * 
     */
    private final Boolean enableAdminAccess;
    /**
     * @return Indicates whether the desktop communication feature is enabled for cloud desktops in the same workspace. After the feature is enabled, the cloud desktops in the same workspace can access each other.
     * 
     */
    private final Boolean enableCrossDesktopAccess;
    /**
     * @return Whether the Open Internet Access Function.
     * 
     */
    private final Boolean enableInternetAccess;
    /**
     * @return NAS File System ID.
     * 
     */
    private final List<String> fileSystemIds;
    /**
     * @return The ID of the Ad Connector Office Site.
     * 
     */
    private final String id;
    /**
     * @return Registered Log Information.
     * 
     */
    private final List<GetAdConnectorOfficeSitesSiteLog> logs;
    /**
     * @return Whether to Enable Multi-Factor Authentication MFA.
     * 
     */
    private final Boolean mfaEnabled;
    /**
     * @return The ID of the Internet Access.
     * 
     */
    private final String networkPackageId;
    /**
     * @return The ID of the Workspace.
     * 
     */
    private final String officeSiteId;
    /**
     * @return Workspace Account System Type. Possible Values: Simple: Convenient Account. AD_CONNECTOR: Enterprise Ad Account.
     * 
     */
    private final String officeSiteType;
    /**
     * @return Whether to Enable Single Sign-on (SSO) for User-Based SSO.
     * 
     */
    private final Boolean ssoEnabled;
    /**
     * @return The workspace status.
     * 
     */
    private final String status;
    /**
     * @return Sub-Domain DNS Address.
     * 
     */
    private final List<String> subDomainDnsAddresses;
    /**
     * @return The AD Domain DNS Name.
     * 
     */
    private final String subDomainName;
    /**
     * @return The AD Trust Password.
     * 
     */
    private final String trustPassword;
    /**
     * @return Security Office VPC ID.
     * 
     */
    private final String vpcId;
    /**
     * @return The vswitch ids.
     * 
     */
    private final List<String> vswitchIds;

    @CustomType.Constructor
    private GetAdConnectorOfficeSitesSite(
        @CustomType.Parameter("adConnectorOfficeSiteName") String adConnectorOfficeSiteName,
        @CustomType.Parameter("adConnectors") List<GetAdConnectorOfficeSitesSiteAdConnector> adConnectors,
        @CustomType.Parameter("bandwidth") Integer bandwidth,
        @CustomType.Parameter("cenId") String cenId,
        @CustomType.Parameter("cidrBlock") String cidrBlock,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("customSecurityGroupId") String customSecurityGroupId,
        @CustomType.Parameter("desktopAccessType") String desktopAccessType,
        @CustomType.Parameter("desktopVpcEndpoint") String desktopVpcEndpoint,
        @CustomType.Parameter("dnsAddresses") List<String> dnsAddresses,
        @CustomType.Parameter("dnsUserName") String dnsUserName,
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("domainUserName") String domainUserName,
        @CustomType.Parameter("enableAdminAccess") Boolean enableAdminAccess,
        @CustomType.Parameter("enableCrossDesktopAccess") Boolean enableCrossDesktopAccess,
        @CustomType.Parameter("enableInternetAccess") Boolean enableInternetAccess,
        @CustomType.Parameter("fileSystemIds") List<String> fileSystemIds,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("logs") List<GetAdConnectorOfficeSitesSiteLog> logs,
        @CustomType.Parameter("mfaEnabled") Boolean mfaEnabled,
        @CustomType.Parameter("networkPackageId") String networkPackageId,
        @CustomType.Parameter("officeSiteId") String officeSiteId,
        @CustomType.Parameter("officeSiteType") String officeSiteType,
        @CustomType.Parameter("ssoEnabled") Boolean ssoEnabled,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("subDomainDnsAddresses") List<String> subDomainDnsAddresses,
        @CustomType.Parameter("subDomainName") String subDomainName,
        @CustomType.Parameter("trustPassword") String trustPassword,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchIds") List<String> vswitchIds) {
        this.adConnectorOfficeSiteName = adConnectorOfficeSiteName;
        this.adConnectors = adConnectors;
        this.bandwidth = bandwidth;
        this.cenId = cenId;
        this.cidrBlock = cidrBlock;
        this.createTime = createTime;
        this.customSecurityGroupId = customSecurityGroupId;
        this.desktopAccessType = desktopAccessType;
        this.desktopVpcEndpoint = desktopVpcEndpoint;
        this.dnsAddresses = dnsAddresses;
        this.dnsUserName = dnsUserName;
        this.domainName = domainName;
        this.domainUserName = domainUserName;
        this.enableAdminAccess = enableAdminAccess;
        this.enableCrossDesktopAccess = enableCrossDesktopAccess;
        this.enableInternetAccess = enableInternetAccess;
        this.fileSystemIds = fileSystemIds;
        this.id = id;
        this.logs = logs;
        this.mfaEnabled = mfaEnabled;
        this.networkPackageId = networkPackageId;
        this.officeSiteId = officeSiteId;
        this.officeSiteType = officeSiteType;
        this.ssoEnabled = ssoEnabled;
        this.status = status;
        this.subDomainDnsAddresses = subDomainDnsAddresses;
        this.subDomainName = subDomainName;
        this.trustPassword = trustPassword;
        this.vpcId = vpcId;
        this.vswitchIds = vswitchIds;
    }

    /**
     * @return The Name of the ad connector office site.
     * 
     */
    public String adConnectorOfficeSiteName() {
        return this.adConnectorOfficeSiteName;
    }
    /**
     * @return AD Connector Collection of Information.
     * 
     */
    public List<GetAdConnectorOfficeSitesSiteAdConnector> adConnectors() {
        return this.adConnectors;
    }
    /**
     * @return The Internet Bandwidth Peak. Possible Values: 0~200. If This Field Is Set to 0, Indicates That There Is No Open Internet Access.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return Cloud Enterprise Network Instance Id.
     * 
     */
    public String cenId() {
        return this.cenId;
    }
    /**
     * @return Workspace Corresponds to the Security Office Network of IPv4 Segment.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return Workspace Creation Time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Security Group ID.
     * 
     */
    public String customSecurityGroupId() {
        return this.customSecurityGroupId;
    }
    /**
     * @return The method that is used to connect the client to cloud desktops.
     * 
     */
    public String desktopAccessType() {
        return this.desktopAccessType;
    }
    /**
     * @return The endpoint that is used to connect to cloud desktops over a VPC.
     * 
     */
    public String desktopVpcEndpoint() {
        return this.desktopVpcEndpoint;
    }
    /**
     * @return Enterprise Ad Corresponding DNS Address.
     * 
     */
    public List<String> dnsAddresses() {
        return this.dnsAddresses;
    }
    /**
     * @return The Easy-to-Use DNS Name.
     * 
     */
    public String dnsUserName() {
        return this.dnsUserName;
    }
    /**
     * @return Enterprise of Ad Domain Name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The Domain Administrator&#39;s Username.
     * 
     */
    public String domainUserName() {
        return this.domainUserName;
    }
    /**
     * @return Whether to Use Cloud Desktop User Empowerment of Local Administrator Permissions.
     * 
     */
    public Boolean enableAdminAccess() {
        return this.enableAdminAccess;
    }
    /**
     * @return Indicates whether the desktop communication feature is enabled for cloud desktops in the same workspace. After the feature is enabled, the cloud desktops in the same workspace can access each other.
     * 
     */
    public Boolean enableCrossDesktopAccess() {
        return this.enableCrossDesktopAccess;
    }
    /**
     * @return Whether the Open Internet Access Function.
     * 
     */
    public Boolean enableInternetAccess() {
        return this.enableInternetAccess;
    }
    /**
     * @return NAS File System ID.
     * 
     */
    public List<String> fileSystemIds() {
        return this.fileSystemIds;
    }
    /**
     * @return The ID of the Ad Connector Office Site.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Registered Log Information.
     * 
     */
    public List<GetAdConnectorOfficeSitesSiteLog> logs() {
        return this.logs;
    }
    /**
     * @return Whether to Enable Multi-Factor Authentication MFA.
     * 
     */
    public Boolean mfaEnabled() {
        return this.mfaEnabled;
    }
    /**
     * @return The ID of the Internet Access.
     * 
     */
    public String networkPackageId() {
        return this.networkPackageId;
    }
    /**
     * @return The ID of the Workspace.
     * 
     */
    public String officeSiteId() {
        return this.officeSiteId;
    }
    /**
     * @return Workspace Account System Type. Possible Values: Simple: Convenient Account. AD_CONNECTOR: Enterprise Ad Account.
     * 
     */
    public String officeSiteType() {
        return this.officeSiteType;
    }
    /**
     * @return Whether to Enable Single Sign-on (SSO) for User-Based SSO.
     * 
     */
    public Boolean ssoEnabled() {
        return this.ssoEnabled;
    }
    /**
     * @return The workspace status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Sub-Domain DNS Address.
     * 
     */
    public List<String> subDomainDnsAddresses() {
        return this.subDomainDnsAddresses;
    }
    /**
     * @return The AD Domain DNS Name.
     * 
     */
    public String subDomainName() {
        return this.subDomainName;
    }
    /**
     * @return The AD Trust Password.
     * 
     */
    public String trustPassword() {
        return this.trustPassword;
    }
    /**
     * @return Security Office VPC ID.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The vswitch ids.
     * 
     */
    public List<String> vswitchIds() {
        return this.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdConnectorOfficeSitesSite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adConnectorOfficeSiteName;
        private List<GetAdConnectorOfficeSitesSiteAdConnector> adConnectors;
        private Integer bandwidth;
        private String cenId;
        private String cidrBlock;
        private String createTime;
        private String customSecurityGroupId;
        private String desktopAccessType;
        private String desktopVpcEndpoint;
        private List<String> dnsAddresses;
        private String dnsUserName;
        private String domainName;
        private String domainUserName;
        private Boolean enableAdminAccess;
        private Boolean enableCrossDesktopAccess;
        private Boolean enableInternetAccess;
        private List<String> fileSystemIds;
        private String id;
        private List<GetAdConnectorOfficeSitesSiteLog> logs;
        private Boolean mfaEnabled;
        private String networkPackageId;
        private String officeSiteId;
        private String officeSiteType;
        private Boolean ssoEnabled;
        private String status;
        private List<String> subDomainDnsAddresses;
        private String subDomainName;
        private String trustPassword;
        private String vpcId;
        private List<String> vswitchIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAdConnectorOfficeSitesSite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adConnectorOfficeSiteName = defaults.adConnectorOfficeSiteName;
    	      this.adConnectors = defaults.adConnectors;
    	      this.bandwidth = defaults.bandwidth;
    	      this.cenId = defaults.cenId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.createTime = defaults.createTime;
    	      this.customSecurityGroupId = defaults.customSecurityGroupId;
    	      this.desktopAccessType = defaults.desktopAccessType;
    	      this.desktopVpcEndpoint = defaults.desktopVpcEndpoint;
    	      this.dnsAddresses = defaults.dnsAddresses;
    	      this.dnsUserName = defaults.dnsUserName;
    	      this.domainName = defaults.domainName;
    	      this.domainUserName = defaults.domainUserName;
    	      this.enableAdminAccess = defaults.enableAdminAccess;
    	      this.enableCrossDesktopAccess = defaults.enableCrossDesktopAccess;
    	      this.enableInternetAccess = defaults.enableInternetAccess;
    	      this.fileSystemIds = defaults.fileSystemIds;
    	      this.id = defaults.id;
    	      this.logs = defaults.logs;
    	      this.mfaEnabled = defaults.mfaEnabled;
    	      this.networkPackageId = defaults.networkPackageId;
    	      this.officeSiteId = defaults.officeSiteId;
    	      this.officeSiteType = defaults.officeSiteType;
    	      this.ssoEnabled = defaults.ssoEnabled;
    	      this.status = defaults.status;
    	      this.subDomainDnsAddresses = defaults.subDomainDnsAddresses;
    	      this.subDomainName = defaults.subDomainName;
    	      this.trustPassword = defaults.trustPassword;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchIds = defaults.vswitchIds;
        }

        public Builder adConnectorOfficeSiteName(String adConnectorOfficeSiteName) {
            this.adConnectorOfficeSiteName = Objects.requireNonNull(adConnectorOfficeSiteName);
            return this;
        }
        public Builder adConnectors(List<GetAdConnectorOfficeSitesSiteAdConnector> adConnectors) {
            this.adConnectors = Objects.requireNonNull(adConnectors);
            return this;
        }
        public Builder adConnectors(GetAdConnectorOfficeSitesSiteAdConnector... adConnectors) {
            return adConnectors(List.of(adConnectors));
        }
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder cenId(String cenId) {
            this.cenId = Objects.requireNonNull(cenId);
            return this;
        }
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder customSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = Objects.requireNonNull(customSecurityGroupId);
            return this;
        }
        public Builder desktopAccessType(String desktopAccessType) {
            this.desktopAccessType = Objects.requireNonNull(desktopAccessType);
            return this;
        }
        public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
            this.desktopVpcEndpoint = Objects.requireNonNull(desktopVpcEndpoint);
            return this;
        }
        public Builder dnsAddresses(List<String> dnsAddresses) {
            this.dnsAddresses = Objects.requireNonNull(dnsAddresses);
            return this;
        }
        public Builder dnsAddresses(String... dnsAddresses) {
            return dnsAddresses(List.of(dnsAddresses));
        }
        public Builder dnsUserName(String dnsUserName) {
            this.dnsUserName = Objects.requireNonNull(dnsUserName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainUserName(String domainUserName) {
            this.domainUserName = Objects.requireNonNull(domainUserName);
            return this;
        }
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.enableAdminAccess = Objects.requireNonNull(enableAdminAccess);
            return this;
        }
        public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
            this.enableCrossDesktopAccess = Objects.requireNonNull(enableCrossDesktopAccess);
            return this;
        }
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = Objects.requireNonNull(enableInternetAccess);
            return this;
        }
        public Builder fileSystemIds(List<String> fileSystemIds) {
            this.fileSystemIds = Objects.requireNonNull(fileSystemIds);
            return this;
        }
        public Builder fileSystemIds(String... fileSystemIds) {
            return fileSystemIds(List.of(fileSystemIds));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder logs(List<GetAdConnectorOfficeSitesSiteLog> logs) {
            this.logs = Objects.requireNonNull(logs);
            return this;
        }
        public Builder logs(GetAdConnectorOfficeSitesSiteLog... logs) {
            return logs(List.of(logs));
        }
        public Builder mfaEnabled(Boolean mfaEnabled) {
            this.mfaEnabled = Objects.requireNonNull(mfaEnabled);
            return this;
        }
        public Builder networkPackageId(String networkPackageId) {
            this.networkPackageId = Objects.requireNonNull(networkPackageId);
            return this;
        }
        public Builder officeSiteId(String officeSiteId) {
            this.officeSiteId = Objects.requireNonNull(officeSiteId);
            return this;
        }
        public Builder officeSiteType(String officeSiteType) {
            this.officeSiteType = Objects.requireNonNull(officeSiteType);
            return this;
        }
        public Builder ssoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = Objects.requireNonNull(ssoEnabled);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder subDomainDnsAddresses(List<String> subDomainDnsAddresses) {
            this.subDomainDnsAddresses = Objects.requireNonNull(subDomainDnsAddresses);
            return this;
        }
        public Builder subDomainDnsAddresses(String... subDomainDnsAddresses) {
            return subDomainDnsAddresses(List.of(subDomainDnsAddresses));
        }
        public Builder subDomainName(String subDomainName) {
            this.subDomainName = Objects.requireNonNull(subDomainName);
            return this;
        }
        public Builder trustPassword(String trustPassword) {
            this.trustPassword = Objects.requireNonNull(trustPassword);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vswitchIds(List<String> vswitchIds) {
            this.vswitchIds = Objects.requireNonNull(vswitchIds);
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }        public GetAdConnectorOfficeSitesSite build() {
            return new GetAdConnectorOfficeSitesSite(adConnectorOfficeSiteName, adConnectors, bandwidth, cenId, cidrBlock, createTime, customSecurityGroupId, desktopAccessType, desktopVpcEndpoint, dnsAddresses, dnsUserName, domainName, domainUserName, enableAdminAccess, enableCrossDesktopAccess, enableInternetAccess, fileSystemIds, id, logs, mfaEnabled, networkPackageId, officeSiteId, officeSiteType, ssoEnabled, status, subDomainDnsAddresses, subDomainName, trustPassword, vpcId, vswitchIds);
        }
    }
}
