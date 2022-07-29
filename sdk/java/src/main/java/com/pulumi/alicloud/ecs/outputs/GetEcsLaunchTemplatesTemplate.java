// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetEcsLaunchTemplatesTemplateDataDisk;
import com.pulumi.alicloud.ecs.outputs.GetEcsLaunchTemplatesTemplateNetworkInterface;
import com.pulumi.alicloud.ecs.outputs.GetEcsLaunchTemplatesTemplateSystemDisk;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEcsLaunchTemplatesTemplate {
    /**
     * @return Instance auto release time.
     * 
     */
    private final String autoReleaseTime;
    /**
     * @return CreatedBy.
     * 
     */
    private final String createdBy;
    /**
     * @return The list of data disks created with instance.
     * 
     */
    private final List<GetEcsLaunchTemplatesTemplateDataDisk> dataDisks;
    /**
     * @return The Default Version Number.
     * 
     */
    private final Integer defaultVersionNumber;
    /**
     * @return The Deployment Set Id.
     * 
     */
    private final String deploymentSetId;
    /**
     * @return System disk description.
     * 
     */
    private final String description;
    /**
     * @return Whether to enable the instance operating system configuration.
     * 
     */
    private final Boolean enableVmOsConfig;
    /**
     * @return Instance host name.
     * 
     */
    private final String hostName;
    /**
     * @return The ID of the Launch Template.
     * 
     */
    private final String id;
    /**
     * @return The Image Id.
     * 
     */
    private final String imageId;
    /**
     * @return Mirror source.
     * 
     */
    private final String imageOwnerAlias;
    /**
     * @return Internet bandwidth billing method.
     * 
     */
    private final String instanceChargeType;
    /**
     * @return The Instance Name.
     * 
     */
    private final String instanceName;
    /**
     * @return Instance type.
     * 
     */
    private final String instanceType;
    /**
     * @return Internet bandwidth billing method.
     * 
     */
    private final String internetChargeType;
    /**
     * @return The maximum inbound bandwidth from the Internet network, measured in Mbit/s.
     * 
     */
    private final Integer internetMaxBandwidthIn;
    /**
     * @return Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s.
     * 
     */
    private final Integer internetMaxBandwidthOut;
    /**
     * @return Whether it is an I/O-optimized instance or not.
     * 
     */
    private final String ioOptimized;
    /**
     * @return The name of the key pair.
     * 
     */
    private final String keyPairName;
    /**
     * @return The Latest Version Number.
     * 
     */
    private final Integer latestVersionNumber;
    /**
     * @return The ID of the Launch Template.
     * 
     */
    private final String launchTemplateId;
    /**
     * @return The Launch Template Name.
     * 
     */
    private final String launchTemplateName;
    /**
     * @return The Modified Time.
     * 
     */
    private final String modifiedTime;
    /**
     * @return The list of network interfaces created with instance.
     * 
     */
    private final List<GetEcsLaunchTemplatesTemplateNetworkInterface> networkInterfaces;
    /**
     * @return Network type of the instance.
     * 
     */
    private final String networkType;
    /**
     * @return Whether to use the password preset by the mirror.
     * 
     */
    private final Boolean passwordInherit;
    /**
     * @return The subscription period of the instance.
     * 
     */
    private final Integer period;
    /**
     * @return The private IP address of the instance.
     * 
     */
    private final String privateIpAddress;
    /**
     * @return The RAM role name of the instance.
     * 
     */
    private final String ramRoleName;
    /**
     * @return The ID of the resource group to which to assign the instance, Elastic Block Storage (EBS) device, and ENI.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return Whether or not to activate the security enhancement feature and install network security software free of charge.
     * 
     */
    private final String securityEnhancementStrategy;
    /**
     * @return The security group ID.
     * 
     */
    private final String securityGroupId;
    /**
     * @return The security group IDs.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * @return The protection period of the preemptible instance.
     * 
     */
    private final String spotDuration;
    /**
     * @return Sets the maximum hourly instance price.
     * 
     */
    private final Double spotPriceLimit;
    /**
     * @return The spot strategy for a Pay-As-You-Go instance.
     * 
     */
    private final String spotStrategy;
    /**
     * @return The System Disk.
     * 
     */
    private final List<GetEcsLaunchTemplatesTemplateSystemDisk> systemDisks;
    /**
     * @return The template tags.
     * 
     */
    private final Map<String,Object> templateTags;
    /**
     * @return The User Data.
     * 
     */
    private final String userData;
    /**
     * @return The Version Description.
     * 
     */
    private final String versionDescription;
    /**
     * @return VpcId.
     * 
     */
    private final String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private final String vswitchId;
    /**
     * @return The Zone Id.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetEcsLaunchTemplatesTemplate(
        @CustomType.Parameter("autoReleaseTime") String autoReleaseTime,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("dataDisks") List<GetEcsLaunchTemplatesTemplateDataDisk> dataDisks,
        @CustomType.Parameter("defaultVersionNumber") Integer defaultVersionNumber,
        @CustomType.Parameter("deploymentSetId") String deploymentSetId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enableVmOsConfig") Boolean enableVmOsConfig,
        @CustomType.Parameter("hostName") String hostName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("imageOwnerAlias") String imageOwnerAlias,
        @CustomType.Parameter("instanceChargeType") String instanceChargeType,
        @CustomType.Parameter("instanceName") String instanceName,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("internetChargeType") String internetChargeType,
        @CustomType.Parameter("internetMaxBandwidthIn") Integer internetMaxBandwidthIn,
        @CustomType.Parameter("internetMaxBandwidthOut") Integer internetMaxBandwidthOut,
        @CustomType.Parameter("ioOptimized") String ioOptimized,
        @CustomType.Parameter("keyPairName") String keyPairName,
        @CustomType.Parameter("latestVersionNumber") Integer latestVersionNumber,
        @CustomType.Parameter("launchTemplateId") String launchTemplateId,
        @CustomType.Parameter("launchTemplateName") String launchTemplateName,
        @CustomType.Parameter("modifiedTime") String modifiedTime,
        @CustomType.Parameter("networkInterfaces") List<GetEcsLaunchTemplatesTemplateNetworkInterface> networkInterfaces,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("passwordInherit") Boolean passwordInherit,
        @CustomType.Parameter("period") Integer period,
        @CustomType.Parameter("privateIpAddress") String privateIpAddress,
        @CustomType.Parameter("ramRoleName") String ramRoleName,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("securityEnhancementStrategy") String securityEnhancementStrategy,
        @CustomType.Parameter("securityGroupId") String securityGroupId,
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("spotDuration") String spotDuration,
        @CustomType.Parameter("spotPriceLimit") Double spotPriceLimit,
        @CustomType.Parameter("spotStrategy") String spotStrategy,
        @CustomType.Parameter("systemDisks") List<GetEcsLaunchTemplatesTemplateSystemDisk> systemDisks,
        @CustomType.Parameter("templateTags") Map<String,Object> templateTags,
        @CustomType.Parameter("userData") String userData,
        @CustomType.Parameter("versionDescription") String versionDescription,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.autoReleaseTime = autoReleaseTime;
        this.createdBy = createdBy;
        this.dataDisks = dataDisks;
        this.defaultVersionNumber = defaultVersionNumber;
        this.deploymentSetId = deploymentSetId;
        this.description = description;
        this.enableVmOsConfig = enableVmOsConfig;
        this.hostName = hostName;
        this.id = id;
        this.imageId = imageId;
        this.imageOwnerAlias = imageOwnerAlias;
        this.instanceChargeType = instanceChargeType;
        this.instanceName = instanceName;
        this.instanceType = instanceType;
        this.internetChargeType = internetChargeType;
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        this.ioOptimized = ioOptimized;
        this.keyPairName = keyPairName;
        this.latestVersionNumber = latestVersionNumber;
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.modifiedTime = modifiedTime;
        this.networkInterfaces = networkInterfaces;
        this.networkType = networkType;
        this.passwordInherit = passwordInherit;
        this.period = period;
        this.privateIpAddress = privateIpAddress;
        this.ramRoleName = ramRoleName;
        this.resourceGroupId = resourceGroupId;
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        this.securityGroupId = securityGroupId;
        this.securityGroupIds = securityGroupIds;
        this.spotDuration = spotDuration;
        this.spotPriceLimit = spotPriceLimit;
        this.spotStrategy = spotStrategy;
        this.systemDisks = systemDisks;
        this.templateTags = templateTags;
        this.userData = userData;
        this.versionDescription = versionDescription;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
        this.zoneId = zoneId;
    }

    /**
     * @return Instance auto release time.
     * 
     */
    public String autoReleaseTime() {
        return this.autoReleaseTime;
    }
    /**
     * @return CreatedBy.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The list of data disks created with instance.
     * 
     */
    public List<GetEcsLaunchTemplatesTemplateDataDisk> dataDisks() {
        return this.dataDisks;
    }
    /**
     * @return The Default Version Number.
     * 
     */
    public Integer defaultVersionNumber() {
        return this.defaultVersionNumber;
    }
    /**
     * @return The Deployment Set Id.
     * 
     */
    public String deploymentSetId() {
        return this.deploymentSetId;
    }
    /**
     * @return System disk description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Whether to enable the instance operating system configuration.
     * 
     */
    public Boolean enableVmOsConfig() {
        return this.enableVmOsConfig;
    }
    /**
     * @return Instance host name.
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return The ID of the Launch Template.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Image Id.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return Mirror source.
     * 
     */
    public String imageOwnerAlias() {
        return this.imageOwnerAlias;
    }
    /**
     * @return Internet bandwidth billing method.
     * 
     */
    public String instanceChargeType() {
        return this.instanceChargeType;
    }
    /**
     * @return The Instance Name.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return Instance type.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Internet bandwidth billing method.
     * 
     */
    public String internetChargeType() {
        return this.internetChargeType;
    }
    /**
     * @return The maximum inbound bandwidth from the Internet network, measured in Mbit/s.
     * 
     */
    public Integer internetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }
    /**
     * @return Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s.
     * 
     */
    public Integer internetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }
    /**
     * @return Whether it is an I/O-optimized instance or not.
     * 
     */
    public String ioOptimized() {
        return this.ioOptimized;
    }
    /**
     * @return The name of the key pair.
     * 
     */
    public String keyPairName() {
        return this.keyPairName;
    }
    /**
     * @return The Latest Version Number.
     * 
     */
    public Integer latestVersionNumber() {
        return this.latestVersionNumber;
    }
    /**
     * @return The ID of the Launch Template.
     * 
     */
    public String launchTemplateId() {
        return this.launchTemplateId;
    }
    /**
     * @return The Launch Template Name.
     * 
     */
    public String launchTemplateName() {
        return this.launchTemplateName;
    }
    /**
     * @return The Modified Time.
     * 
     */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * @return The list of network interfaces created with instance.
     * 
     */
    public List<GetEcsLaunchTemplatesTemplateNetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * @return Network type of the instance.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return Whether to use the password preset by the mirror.
     * 
     */
    public Boolean passwordInherit() {
        return this.passwordInherit;
    }
    /**
     * @return The subscription period of the instance.
     * 
     */
    public Integer period() {
        return this.period;
    }
    /**
     * @return The private IP address of the instance.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return The RAM role name of the instance.
     * 
     */
    public String ramRoleName() {
        return this.ramRoleName;
    }
    /**
     * @return The ID of the resource group to which to assign the instance, Elastic Block Storage (EBS) device, and ENI.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return Whether or not to activate the security enhancement feature and install network security software free of charge.
     * 
     */
    public String securityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }
    /**
     * @return The security group ID.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The security group IDs.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return The protection period of the preemptible instance.
     * 
     */
    public String spotDuration() {
        return this.spotDuration;
    }
    /**
     * @return Sets the maximum hourly instance price.
     * 
     */
    public Double spotPriceLimit() {
        return this.spotPriceLimit;
    }
    /**
     * @return The spot strategy for a Pay-As-You-Go instance.
     * 
     */
    public String spotStrategy() {
        return this.spotStrategy;
    }
    /**
     * @return The System Disk.
     * 
     */
    public List<GetEcsLaunchTemplatesTemplateSystemDisk> systemDisks() {
        return this.systemDisks;
    }
    /**
     * @return The template tags.
     * 
     */
    public Map<String,Object> templateTags() {
        return this.templateTags;
    }
    /**
     * @return The User Data.
     * 
     */
    public String userData() {
        return this.userData;
    }
    /**
     * @return The Version Description.
     * 
     */
    public String versionDescription() {
        return this.versionDescription;
    }
    /**
     * @return VpcId.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The vswitch id.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The Zone Id.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsLaunchTemplatesTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoReleaseTime;
        private String createdBy;
        private List<GetEcsLaunchTemplatesTemplateDataDisk> dataDisks;
        private Integer defaultVersionNumber;
        private String deploymentSetId;
        private String description;
        private Boolean enableVmOsConfig;
        private String hostName;
        private String id;
        private String imageId;
        private String imageOwnerAlias;
        private String instanceChargeType;
        private String instanceName;
        private String instanceType;
        private String internetChargeType;
        private Integer internetMaxBandwidthIn;
        private Integer internetMaxBandwidthOut;
        private String ioOptimized;
        private String keyPairName;
        private Integer latestVersionNumber;
        private String launchTemplateId;
        private String launchTemplateName;
        private String modifiedTime;
        private List<GetEcsLaunchTemplatesTemplateNetworkInterface> networkInterfaces;
        private String networkType;
        private Boolean passwordInherit;
        private Integer period;
        private String privateIpAddress;
        private String ramRoleName;
        private String resourceGroupId;
        private String securityEnhancementStrategy;
        private String securityGroupId;
        private List<String> securityGroupIds;
        private String spotDuration;
        private Double spotPriceLimit;
        private String spotStrategy;
        private List<GetEcsLaunchTemplatesTemplateSystemDisk> systemDisks;
        private Map<String,Object> templateTags;
        private String userData;
        private String versionDescription;
        private String vpcId;
        private String vswitchId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsLaunchTemplatesTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoReleaseTime = defaults.autoReleaseTime;
    	      this.createdBy = defaults.createdBy;
    	      this.dataDisks = defaults.dataDisks;
    	      this.defaultVersionNumber = defaults.defaultVersionNumber;
    	      this.deploymentSetId = defaults.deploymentSetId;
    	      this.description = defaults.description;
    	      this.enableVmOsConfig = defaults.enableVmOsConfig;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.imageOwnerAlias = defaults.imageOwnerAlias;
    	      this.instanceChargeType = defaults.instanceChargeType;
    	      this.instanceName = defaults.instanceName;
    	      this.instanceType = defaults.instanceType;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.internetMaxBandwidthIn = defaults.internetMaxBandwidthIn;
    	      this.internetMaxBandwidthOut = defaults.internetMaxBandwidthOut;
    	      this.ioOptimized = defaults.ioOptimized;
    	      this.keyPairName = defaults.keyPairName;
    	      this.latestVersionNumber = defaults.latestVersionNumber;
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkType = defaults.networkType;
    	      this.passwordInherit = defaults.passwordInherit;
    	      this.period = defaults.period;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.ramRoleName = defaults.ramRoleName;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.securityEnhancementStrategy = defaults.securityEnhancementStrategy;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.spotDuration = defaults.spotDuration;
    	      this.spotPriceLimit = defaults.spotPriceLimit;
    	      this.spotStrategy = defaults.spotStrategy;
    	      this.systemDisks = defaults.systemDisks;
    	      this.templateTags = defaults.templateTags;
    	      this.userData = defaults.userData;
    	      this.versionDescription = defaults.versionDescription;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder autoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = Objects.requireNonNull(autoReleaseTime);
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder dataDisks(List<GetEcsLaunchTemplatesTemplateDataDisk> dataDisks) {
            this.dataDisks = Objects.requireNonNull(dataDisks);
            return this;
        }
        public Builder dataDisks(GetEcsLaunchTemplatesTemplateDataDisk... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder defaultVersionNumber(Integer defaultVersionNumber) {
            this.defaultVersionNumber = Objects.requireNonNull(defaultVersionNumber);
            return this;
        }
        public Builder deploymentSetId(String deploymentSetId) {
            this.deploymentSetId = Objects.requireNonNull(deploymentSetId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enableVmOsConfig(Boolean enableVmOsConfig) {
            this.enableVmOsConfig = Objects.requireNonNull(enableVmOsConfig);
            return this;
        }
        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = Objects.requireNonNull(imageOwnerAlias);
            return this;
        }
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = Objects.requireNonNull(instanceChargeType);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = Objects.requireNonNull(internetChargeType);
            return this;
        }
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = Objects.requireNonNull(internetMaxBandwidthIn);
            return this;
        }
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = Objects.requireNonNull(internetMaxBandwidthOut);
            return this;
        }
        public Builder ioOptimized(String ioOptimized) {
            this.ioOptimized = Objects.requireNonNull(ioOptimized);
            return this;
        }
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = Objects.requireNonNull(keyPairName);
            return this;
        }
        public Builder latestVersionNumber(Integer latestVersionNumber) {
            this.latestVersionNumber = Objects.requireNonNull(latestVersionNumber);
            return this;
        }
        public Builder launchTemplateId(String launchTemplateId) {
            this.launchTemplateId = Objects.requireNonNull(launchTemplateId);
            return this;
        }
        public Builder launchTemplateName(String launchTemplateName) {
            this.launchTemplateName = Objects.requireNonNull(launchTemplateName);
            return this;
        }
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }
        public Builder networkInterfaces(List<GetEcsLaunchTemplatesTemplateNetworkInterface> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(GetEcsLaunchTemplatesTemplateNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder passwordInherit(Boolean passwordInherit) {
            this.passwordInherit = Objects.requireNonNull(passwordInherit);
            return this;
        }
        public Builder period(Integer period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = Objects.requireNonNull(ramRoleName);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = Objects.requireNonNull(securityEnhancementStrategy);
            return this;
        }
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder spotDuration(String spotDuration) {
            this.spotDuration = Objects.requireNonNull(spotDuration);
            return this;
        }
        public Builder spotPriceLimit(Double spotPriceLimit) {
            this.spotPriceLimit = Objects.requireNonNull(spotPriceLimit);
            return this;
        }
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = Objects.requireNonNull(spotStrategy);
            return this;
        }
        public Builder systemDisks(List<GetEcsLaunchTemplatesTemplateSystemDisk> systemDisks) {
            this.systemDisks = Objects.requireNonNull(systemDisks);
            return this;
        }
        public Builder systemDisks(GetEcsLaunchTemplatesTemplateSystemDisk... systemDisks) {
            return systemDisks(List.of(systemDisks));
        }
        public Builder templateTags(Map<String,Object> templateTags) {
            this.templateTags = Objects.requireNonNull(templateTags);
            return this;
        }
        public Builder userData(String userData) {
            this.userData = Objects.requireNonNull(userData);
            return this;
        }
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = Objects.requireNonNull(versionDescription);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetEcsLaunchTemplatesTemplate build() {
            return new GetEcsLaunchTemplatesTemplate(autoReleaseTime, createdBy, dataDisks, defaultVersionNumber, deploymentSetId, description, enableVmOsConfig, hostName, id, imageId, imageOwnerAlias, instanceChargeType, instanceName, instanceType, internetChargeType, internetMaxBandwidthIn, internetMaxBandwidthOut, ioOptimized, keyPairName, latestVersionNumber, launchTemplateId, launchTemplateName, modifiedTime, networkInterfaces, networkType, passwordInherit, period, privateIpAddress, ramRoleName, resourceGroupId, securityEnhancementStrategy, securityGroupId, securityGroupIds, spotDuration, spotPriceLimit, spotStrategy, systemDisks, templateTags, userData, versionDescription, vpcId, vswitchId, zoneId);
        }
    }
}
