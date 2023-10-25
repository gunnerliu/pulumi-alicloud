// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a ECS Launch Template resource.
 *
 * For information about ECS Launch Template and how to use it, see [What is Launch Template](https://www.alibabacloud.com/help/en/doc-detail/74686.htm).
 *
 * > **NOTE:** Available since v1.120.0.
 *
 * ## Import
 *
 * ECS Launch Template can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsLaunchTemplate:EcsLaunchTemplate example <id>
 * ```
 */
export class EcsLaunchTemplate extends pulumi.CustomResource {
    /**
     * Get an existing EcsLaunchTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EcsLaunchTemplateState, opts?: pulumi.CustomResourceOptions): EcsLaunchTemplate {
        return new EcsLaunchTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ecs/ecsLaunchTemplate:EcsLaunchTemplate';

    /**
     * Returns true if the given object is an instance of EcsLaunchTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EcsLaunchTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EcsLaunchTemplate.__pulumiType;
    }

    /**
     * Instance auto release time. The time is presented using the ISO8601 standard and in UTC time. The format is  YYYY-MM-DDTHH:MM:SSZ.
     */
    public readonly autoReleaseTime!: pulumi.Output<string | undefined>;
    /**
     * The list of data disks created with instance. See `dataDisks` below.
     */
    public readonly dataDisks!: pulumi.Output<outputs.ecs.EcsLaunchTemplateDataDisk[] | undefined>;
    /**
     * The Deployment Set Id.
     */
    public readonly deploymentSetId!: pulumi.Output<string | undefined>;
    /**
     * Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with "http://" or "https://". The default value is null.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable the instance operating system configuration.
     */
    public readonly enableVmOsConfig!: pulumi.Output<boolean | undefined>;
    /**
     * Instance host name.It cannot start or end with a period (.) or a hyphen (-) and it cannot have two or more consecutive periods (.) or hyphens (-).For Windows: The host name can be [2, 15] characters in length. It can contain A-Z, a-z, numbers, periods (.), and hyphens (-). It cannot only contain numbers. For other operating systems: The host name can be [2, 64] characters in length. It can be segments separated by periods (.). It can contain A-Z, a-z, numbers, and hyphens (-).
     */
    public readonly hostName!: pulumi.Output<string | undefined>;
    /**
     * The Image ID.
     */
    public readonly imageId!: pulumi.Output<string | undefined>;
    /**
     * Mirror source. Valid values: `system`, `self`, `others`, `marketplace`, `""`. Default to: `""`.
     */
    public readonly imageOwnerAlias!: pulumi.Output<string | undefined>;
    /**
     * Billing methods. Valid values: `PostPaid`, `PrePaid`.
     */
    public readonly instanceChargeType!: pulumi.Output<string | undefined>;
    /**
     * The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     */
    public readonly instanceName!: pulumi.Output<string | undefined>;
    /**
     * Instance type. For more information, call resourceAlicloudInstances to obtain the latest instance type list.
     */
    public readonly instanceType!: pulumi.Output<string | undefined>;
    /**
     * Internet bandwidth billing method. Valid values: `PayByTraffic`, `PayByBandwidth`.
     */
    public readonly internetChargeType!: pulumi.Output<string | undefined>;
    /**
     * The maximum inbound bandwidth from the Internet network, measured in Mbit/s. Value range: [1, 200].
     */
    public readonly internetMaxBandwidthIn!: pulumi.Output<number>;
    /**
     * Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s. Value range: [0, 100].
     */
    public readonly internetMaxBandwidthOut!: pulumi.Output<number | undefined>;
    /**
     * Whether it is an I/O-optimized instance or not. Valid values: `none`, `optimized`.
     */
    public readonly ioOptimized!: pulumi.Output<string | undefined>;
    /**
     * The name of the key pair.
     * - Ignore this parameter for Windows instances. It is null by default. Even if you enter this parameter, only the  Password content is used.
     * - The password logon method for Linux instances is set to forbidden upon initialization.
     */
    public readonly keyPairName!: pulumi.Output<string | undefined>;
    /**
     * The name of Launch Template.
     */
    public readonly launchTemplateName!: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `launchTemplateName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'launch_template_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The list of network interfaces created with instance. See `networkInterfaces` below.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.ecs.EcsLaunchTemplateNetworkInterfaces | undefined>;
    /**
     * Network type of the instance. Valid values: `classic`, `vpc`.
     */
    public readonly networkType!: pulumi.Output<string | undefined>;
    /**
     * Whether to use the password preset by the mirror.
     */
    public readonly passwordInherit!: pulumi.Output<boolean | undefined>;
    /**
     * The subscription period of the instance. Unit: months. This parameter takes effect and is required only when InstanceChargeType is set to PrePaid. If the DedicatedHostId parameter is specified, the value of the Period parameter must be within the subscription period of the dedicated host.
     * - When the PeriodUnit parameter is set to `Week`, the valid values of the Period parameter are `1`, `2`, `3`, and `4`.
     * - When the PeriodUnit parameter is set to `Month`, the valid values of the Period parameter are `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, and `60`.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The private IP address of the instance.
     */
    public readonly privateIpAddress!: pulumi.Output<string | undefined>;
    /**
     * The RAM role name of the instance. You can use the RAM API ListRoles to query instance RAM role names.
     */
    public readonly ramRoleName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the resource group to which to assign the instance, Elastic Block Storage (EBS) device, and ENI.
     */
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;
    /**
     * Whether or not to activate the security enhancement feature and install network security software free of charge. Valid values: `Active`, `Deactive`.
     */
    public readonly securityEnhancementStrategy!: pulumi.Output<string | undefined>;
    /**
     * The security group ID.
     */
    public readonly securityGroupId!: pulumi.Output<string | undefined>;
    /**
     * The ID of security group N to which to assign the instance.
     */
    public readonly securityGroupIds!: pulumi.Output<string[] | undefined>;
    /**
     * The protection period of the preemptible instance. Unit: hours. Valid values: `0`, `1`, `2`, `3`, `4`, `5`, and `6`. Default to: `1`.
     */
    public readonly spotDuration!: pulumi.Output<string | undefined>;
    /**
     * Sets the maximum hourly instance price. Supports up to three decimal places.
     */
    public readonly spotPriceLimit!: pulumi.Output<number | undefined>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Valid values: `NoSpot`, `SpotAsPriceGo`, `SpotWithPriceLimit`.
     */
    public readonly spotStrategy!: pulumi.Output<string | undefined>;
    /**
     * The System Disk. See `systemDisk` below.
     */
    public readonly systemDisk!: pulumi.Output<outputs.ecs.EcsLaunchTemplateSystemDisk>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_category' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    public readonly systemDiskCategory!: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_description' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    public readonly systemDiskDescription!: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_name' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    public readonly systemDiskName!: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_size' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    public readonly systemDiskSize!: pulumi.Output<number>;
    /**
     * A mapping of tags to assign to instance, block storage, and elastic network.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The template resource group id.
     */
    public readonly templateResourceGroupId!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the launch template.
     */
    public readonly templateTags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The User Data.
     */
    public readonly userData!: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `userData` instead.
     *
     * @deprecated Field 'userdata' has been deprecated from provider version 1.120.0. New field 'user_data' instead.
     */
    public readonly userdata!: pulumi.Output<string>;
    /**
     * The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    public readonly versionDescription!: pulumi.Output<string | undefined>;
    /**
     * The ID of the VPC.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * When creating a VPC-Connected instance, you must specify its VSwitch ID.
     */
    public readonly vswitchId!: pulumi.Output<string | undefined>;
    /**
     * The zone ID of the instance.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a EcsLaunchTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EcsLaunchTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EcsLaunchTemplateArgs | EcsLaunchTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EcsLaunchTemplateState | undefined;
            resourceInputs["autoReleaseTime"] = state ? state.autoReleaseTime : undefined;
            resourceInputs["dataDisks"] = state ? state.dataDisks : undefined;
            resourceInputs["deploymentSetId"] = state ? state.deploymentSetId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enableVmOsConfig"] = state ? state.enableVmOsConfig : undefined;
            resourceInputs["hostName"] = state ? state.hostName : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["imageOwnerAlias"] = state ? state.imageOwnerAlias : undefined;
            resourceInputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            resourceInputs["internetMaxBandwidthIn"] = state ? state.internetMaxBandwidthIn : undefined;
            resourceInputs["internetMaxBandwidthOut"] = state ? state.internetMaxBandwidthOut : undefined;
            resourceInputs["ioOptimized"] = state ? state.ioOptimized : undefined;
            resourceInputs["keyPairName"] = state ? state.keyPairName : undefined;
            resourceInputs["launchTemplateName"] = state ? state.launchTemplateName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["networkType"] = state ? state.networkType : undefined;
            resourceInputs["passwordInherit"] = state ? state.passwordInherit : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["privateIpAddress"] = state ? state.privateIpAddress : undefined;
            resourceInputs["ramRoleName"] = state ? state.ramRoleName : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["securityEnhancementStrategy"] = state ? state.securityEnhancementStrategy : undefined;
            resourceInputs["securityGroupId"] = state ? state.securityGroupId : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["spotDuration"] = state ? state.spotDuration : undefined;
            resourceInputs["spotPriceLimit"] = state ? state.spotPriceLimit : undefined;
            resourceInputs["spotStrategy"] = state ? state.spotStrategy : undefined;
            resourceInputs["systemDisk"] = state ? state.systemDisk : undefined;
            resourceInputs["systemDiskCategory"] = state ? state.systemDiskCategory : undefined;
            resourceInputs["systemDiskDescription"] = state ? state.systemDiskDescription : undefined;
            resourceInputs["systemDiskName"] = state ? state.systemDiskName : undefined;
            resourceInputs["systemDiskSize"] = state ? state.systemDiskSize : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["templateResourceGroupId"] = state ? state.templateResourceGroupId : undefined;
            resourceInputs["templateTags"] = state ? state.templateTags : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
            resourceInputs["userdata"] = state ? state.userdata : undefined;
            resourceInputs["versionDescription"] = state ? state.versionDescription : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as EcsLaunchTemplateArgs | undefined;
            resourceInputs["autoReleaseTime"] = args ? args.autoReleaseTime : undefined;
            resourceInputs["dataDisks"] = args ? args.dataDisks : undefined;
            resourceInputs["deploymentSetId"] = args ? args.deploymentSetId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enableVmOsConfig"] = args ? args.enableVmOsConfig : undefined;
            resourceInputs["hostName"] = args ? args.hostName : undefined;
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["imageOwnerAlias"] = args ? args.imageOwnerAlias : undefined;
            resourceInputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["internetChargeType"] = args ? args.internetChargeType : undefined;
            resourceInputs["internetMaxBandwidthIn"] = args ? args.internetMaxBandwidthIn : undefined;
            resourceInputs["internetMaxBandwidthOut"] = args ? args.internetMaxBandwidthOut : undefined;
            resourceInputs["ioOptimized"] = args ? args.ioOptimized : undefined;
            resourceInputs["keyPairName"] = args ? args.keyPairName : undefined;
            resourceInputs["launchTemplateName"] = args ? args.launchTemplateName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["networkType"] = args ? args.networkType : undefined;
            resourceInputs["passwordInherit"] = args ? args.passwordInherit : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["privateIpAddress"] = args ? args.privateIpAddress : undefined;
            resourceInputs["ramRoleName"] = args ? args.ramRoleName : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["securityEnhancementStrategy"] = args ? args.securityEnhancementStrategy : undefined;
            resourceInputs["securityGroupId"] = args ? args.securityGroupId : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["spotDuration"] = args ? args.spotDuration : undefined;
            resourceInputs["spotPriceLimit"] = args ? args.spotPriceLimit : undefined;
            resourceInputs["spotStrategy"] = args ? args.spotStrategy : undefined;
            resourceInputs["systemDisk"] = args ? args.systemDisk : undefined;
            resourceInputs["systemDiskCategory"] = args ? args.systemDiskCategory : undefined;
            resourceInputs["systemDiskDescription"] = args ? args.systemDiskDescription : undefined;
            resourceInputs["systemDiskName"] = args ? args.systemDiskName : undefined;
            resourceInputs["systemDiskSize"] = args ? args.systemDiskSize : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["templateResourceGroupId"] = args ? args.templateResourceGroupId : undefined;
            resourceInputs["templateTags"] = args ? args.templateTags : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["userdata"] = args ? args.userdata : undefined;
            resourceInputs["versionDescription"] = args ? args.versionDescription : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EcsLaunchTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EcsLaunchTemplate resources.
 */
export interface EcsLaunchTemplateState {
    /**
     * Instance auto release time. The time is presented using the ISO8601 standard and in UTC time. The format is  YYYY-MM-DDTHH:MM:SSZ.
     */
    autoReleaseTime?: pulumi.Input<string>;
    /**
     * The list of data disks created with instance. See `dataDisks` below.
     */
    dataDisks?: pulumi.Input<pulumi.Input<inputs.ecs.EcsLaunchTemplateDataDisk>[]>;
    /**
     * The Deployment Set Id.
     */
    deploymentSetId?: pulumi.Input<string>;
    /**
     * Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with "http://" or "https://". The default value is null.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to enable the instance operating system configuration.
     */
    enableVmOsConfig?: pulumi.Input<boolean>;
    /**
     * Instance host name.It cannot start or end with a period (.) or a hyphen (-) and it cannot have two or more consecutive periods (.) or hyphens (-).For Windows: The host name can be [2, 15] characters in length. It can contain A-Z, a-z, numbers, periods (.), and hyphens (-). It cannot only contain numbers. For other operating systems: The host name can be [2, 64] characters in length. It can be segments separated by periods (.). It can contain A-Z, a-z, numbers, and hyphens (-).
     */
    hostName?: pulumi.Input<string>;
    /**
     * The Image ID.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Mirror source. Valid values: `system`, `self`, `others`, `marketplace`, `""`. Default to: `""`.
     */
    imageOwnerAlias?: pulumi.Input<string>;
    /**
     * Billing methods. Valid values: `PostPaid`, `PrePaid`.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Instance type. For more information, call resourceAlicloudInstances to obtain the latest instance type list.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * Internet bandwidth billing method. Valid values: `PayByTraffic`, `PayByBandwidth`.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * The maximum inbound bandwidth from the Internet network, measured in Mbit/s. Value range: [1, 200].
     */
    internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s. Value range: [0, 100].
     */
    internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * Whether it is an I/O-optimized instance or not. Valid values: `none`, `optimized`.
     */
    ioOptimized?: pulumi.Input<string>;
    /**
     * The name of the key pair.
     * - Ignore this parameter for Windows instances. It is null by default. Even if you enter this parameter, only the  Password content is used.
     * - The password logon method for Linux instances is set to forbidden upon initialization.
     */
    keyPairName?: pulumi.Input<string>;
    /**
     * The name of Launch Template.
     */
    launchTemplateName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `launchTemplateName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'launch_template_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The list of network interfaces created with instance. See `networkInterfaces` below.
     */
    networkInterfaces?: pulumi.Input<inputs.ecs.EcsLaunchTemplateNetworkInterfaces>;
    /**
     * Network type of the instance. Valid values: `classic`, `vpc`.
     */
    networkType?: pulumi.Input<string>;
    /**
     * Whether to use the password preset by the mirror.
     */
    passwordInherit?: pulumi.Input<boolean>;
    /**
     * The subscription period of the instance. Unit: months. This parameter takes effect and is required only when InstanceChargeType is set to PrePaid. If the DedicatedHostId parameter is specified, the value of the Period parameter must be within the subscription period of the dedicated host.
     * - When the PeriodUnit parameter is set to `Week`, the valid values of the Period parameter are `1`, `2`, `3`, and `4`.
     * - When the PeriodUnit parameter is set to `Month`, the valid values of the Period parameter are `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, and `60`.
     */
    period?: pulumi.Input<number>;
    /**
     * The private IP address of the instance.
     */
    privateIpAddress?: pulumi.Input<string>;
    /**
     * The RAM role name of the instance. You can use the RAM API ListRoles to query instance RAM role names.
     */
    ramRoleName?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which to assign the instance, Elastic Block Storage (EBS) device, and ENI.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Whether or not to activate the security enhancement feature and install network security software free of charge. Valid values: `Active`, `Deactive`.
     */
    securityEnhancementStrategy?: pulumi.Input<string>;
    /**
     * The security group ID.
     */
    securityGroupId?: pulumi.Input<string>;
    /**
     * The ID of security group N to which to assign the instance.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The protection period of the preemptible instance. Unit: hours. Valid values: `0`, `1`, `2`, `3`, `4`, `5`, and `6`. Default to: `1`.
     */
    spotDuration?: pulumi.Input<string>;
    /**
     * Sets the maximum hourly instance price. Supports up to three decimal places.
     */
    spotPriceLimit?: pulumi.Input<number>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Valid values: `NoSpot`, `SpotAsPriceGo`, `SpotWithPriceLimit`.
     */
    spotStrategy?: pulumi.Input<string>;
    /**
     * The System Disk. See `systemDisk` below.
     */
    systemDisk?: pulumi.Input<inputs.ecs.EcsLaunchTemplateSystemDisk>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_category' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    systemDiskCategory?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_description' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    systemDiskDescription?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_name' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    systemDiskName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_size' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    systemDiskSize?: pulumi.Input<number>;
    /**
     * A mapping of tags to assign to instance, block storage, and elastic network.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The template resource group id.
     */
    templateResourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the launch template.
     */
    templateTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The User Data.
     */
    userData?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `userData` instead.
     *
     * @deprecated Field 'userdata' has been deprecated from provider version 1.120.0. New field 'user_data' instead.
     */
    userdata?: pulumi.Input<string>;
    /**
     * The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    versionDescription?: pulumi.Input<string>;
    /**
     * The ID of the VPC.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * When creating a VPC-Connected instance, you must specify its VSwitch ID.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the instance.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EcsLaunchTemplate resource.
 */
export interface EcsLaunchTemplateArgs {
    /**
     * Instance auto release time. The time is presented using the ISO8601 standard and in UTC time. The format is  YYYY-MM-DDTHH:MM:SSZ.
     */
    autoReleaseTime?: pulumi.Input<string>;
    /**
     * The list of data disks created with instance. See `dataDisks` below.
     */
    dataDisks?: pulumi.Input<pulumi.Input<inputs.ecs.EcsLaunchTemplateDataDisk>[]>;
    /**
     * The Deployment Set Id.
     */
    deploymentSetId?: pulumi.Input<string>;
    /**
     * Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with "http://" or "https://". The default value is null.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to enable the instance operating system configuration.
     */
    enableVmOsConfig?: pulumi.Input<boolean>;
    /**
     * Instance host name.It cannot start or end with a period (.) or a hyphen (-) and it cannot have two or more consecutive periods (.) or hyphens (-).For Windows: The host name can be [2, 15] characters in length. It can contain A-Z, a-z, numbers, periods (.), and hyphens (-). It cannot only contain numbers. For other operating systems: The host name can be [2, 64] characters in length. It can be segments separated by periods (.). It can contain A-Z, a-z, numbers, and hyphens (-).
     */
    hostName?: pulumi.Input<string>;
    /**
     * The Image ID.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Mirror source. Valid values: `system`, `self`, `others`, `marketplace`, `""`. Default to: `""`.
     */
    imageOwnerAlias?: pulumi.Input<string>;
    /**
     * Billing methods. Valid values: `PostPaid`, `PrePaid`.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     */
    instanceName?: pulumi.Input<string>;
    /**
     * Instance type. For more information, call resourceAlicloudInstances to obtain the latest instance type list.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * Internet bandwidth billing method. Valid values: `PayByTraffic`, `PayByBandwidth`.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * The maximum inbound bandwidth from the Internet network, measured in Mbit/s. Value range: [1, 200].
     */
    internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s. Value range: [0, 100].
     */
    internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * Whether it is an I/O-optimized instance or not. Valid values: `none`, `optimized`.
     */
    ioOptimized?: pulumi.Input<string>;
    /**
     * The name of the key pair.
     * - Ignore this parameter for Windows instances. It is null by default. Even if you enter this parameter, only the  Password content is used.
     * - The password logon method for Linux instances is set to forbidden upon initialization.
     */
    keyPairName?: pulumi.Input<string>;
    /**
     * The name of Launch Template.
     */
    launchTemplateName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `launchTemplateName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'launch_template_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The list of network interfaces created with instance. See `networkInterfaces` below.
     */
    networkInterfaces?: pulumi.Input<inputs.ecs.EcsLaunchTemplateNetworkInterfaces>;
    /**
     * Network type of the instance. Valid values: `classic`, `vpc`.
     */
    networkType?: pulumi.Input<string>;
    /**
     * Whether to use the password preset by the mirror.
     */
    passwordInherit?: pulumi.Input<boolean>;
    /**
     * The subscription period of the instance. Unit: months. This parameter takes effect and is required only when InstanceChargeType is set to PrePaid. If the DedicatedHostId parameter is specified, the value of the Period parameter must be within the subscription period of the dedicated host.
     * - When the PeriodUnit parameter is set to `Week`, the valid values of the Period parameter are `1`, `2`, `3`, and `4`.
     * - When the PeriodUnit parameter is set to `Month`, the valid values of the Period parameter are `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, and `60`.
     */
    period?: pulumi.Input<number>;
    /**
     * The private IP address of the instance.
     */
    privateIpAddress?: pulumi.Input<string>;
    /**
     * The RAM role name of the instance. You can use the RAM API ListRoles to query instance RAM role names.
     */
    ramRoleName?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which to assign the instance, Elastic Block Storage (EBS) device, and ENI.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Whether or not to activate the security enhancement feature and install network security software free of charge. Valid values: `Active`, `Deactive`.
     */
    securityEnhancementStrategy?: pulumi.Input<string>;
    /**
     * The security group ID.
     */
    securityGroupId?: pulumi.Input<string>;
    /**
     * The ID of security group N to which to assign the instance.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The protection period of the preemptible instance. Unit: hours. Valid values: `0`, `1`, `2`, `3`, `4`, `5`, and `6`. Default to: `1`.
     */
    spotDuration?: pulumi.Input<string>;
    /**
     * Sets the maximum hourly instance price. Supports up to three decimal places.
     */
    spotPriceLimit?: pulumi.Input<number>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Valid values: `NoSpot`, `SpotAsPriceGo`, `SpotWithPriceLimit`.
     */
    spotStrategy?: pulumi.Input<string>;
    /**
     * The System Disk. See `systemDisk` below.
     */
    systemDisk?: pulumi.Input<inputs.ecs.EcsLaunchTemplateSystemDisk>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_category' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    systemDiskCategory?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_description' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    systemDiskDescription?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_name' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    systemDiskName?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `systemDisk` instead.
     *
     * @deprecated Field 'system_disk_size' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    systemDiskSize?: pulumi.Input<number>;
    /**
     * A mapping of tags to assign to instance, block storage, and elastic network.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The template resource group id.
     */
    templateResourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the launch template.
     */
    templateTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The User Data.
     */
    userData?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.120.0, and use field `userData` instead.
     *
     * @deprecated Field 'userdata' has been deprecated from provider version 1.120.0. New field 'user_data' instead.
     */
    userdata?: pulumi.Input<string>;
    /**
     * The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    versionDescription?: pulumi.Input<string>;
    /**
     * The ID of the VPC.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * When creating a VPC-Connected instance, you must specify its VSwitch ID.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the instance.
     */
    zoneId?: pulumi.Input<string>;
}
