// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a ECS Launch Template resource.
 *
 * For information about ECS Launch Template and how to use it, see [What is Launch Template](https://www.alibabacloud.com/help/en/doc-detail/74686.htm).
 *
 * > **NOTE:** Available in v1.120.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultEcsLaunchTemplate = new alicloud.ecs.EcsLaunchTemplate("default", {
 *     dataDisks: [
 *         {
 *             category: "cloud",
 *             deleteWithInstance: true,
 *             description: "test1",
 *             encrypted: false,
 *             name: "disk1",
 *             performanceLevel: "PL0",
 *             size: 20,
 *         },
 *         {
 *             category: "cloud",
 *             deleteWithInstance: true,
 *             description: "test2",
 *             encrypted: false,
 *             name: "disk2",
 *             performanceLevel: "PL0",
 *             size: 20,
 *         },
 *     ],
 *     description: "Test For Terraform",
 *     hostName: "host_name",
 *     imageId: "m-bp1i3ucxxxxx",
 *     instanceChargeType: "PrePaid",
 *     instanceName: "instance_name",
 *     instanceType: "instance_type",
 *     internetChargeType: "PayByBandwidth",
 *     internetMaxBandwidthIn: 5,
 *     internetMaxBandwidthOut: 0,
 *     ioOptimized: "optimized",
 *     keyPairName: "key_pair_name",
 *     networkInterfaces: {
 *         description: "hello1",
 *         name: "eth0",
 *         primaryIp: "10.0.0.2",
 *         securityGroupId: "sg-asdfnbgxxxxxxx",
 *         vswitchId: "vw-zkdfjaxxxxxx",
 *     },
 *     networkType: "vpc",
 *     ramRoleName: "ram_role_name",
 *     resourceGroupId: "rg-zkdfjaxxxxxx",
 *     securityEnhancementStrategy: "Active",
 *     securityGroupIds: ["sg-zkdfjaxxxxxx"],
 *     spotPriceLimit: 5,
 *     spotStrategy: "SpotWithPriceLimit",
 *     systemDisk: {
 *         category: "cloud_ssd",
 *         deleteWithInstance: false,
 *         description: "Test For Terraform",
 *         name: "tf_test_name",
 *         size: 40,
 *     },
 *     templateTags: {
 *         Create: "Terraform",
 *         For: "Test",
 *     },
 *     userData: "xxxxxxx",
 *     vpcId: "vpc-asdfnbgxxxxxxx",
 *     vswitchId: "vw-zwxscaxxxxxx",
 *     zoneId: "cn-hangzhou-i",
 * });
 * ```
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
     * The list of data disks created with instance.
     */
    public readonly dataDisks!: pulumi.Output<outputs.ecs.EcsLaunchTemplateDataDisk[] | undefined>;
    /**
     * The Deployment Set Id.
     */
    public readonly deploymentSetId!: pulumi.Output<string | undefined>;
    /**
     * The description of the data disk.
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
     * The name of the data disk.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'launch_template_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The list of network interfaces created with instance.
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
     * The security group ID must be one in the same VPC.
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
     * -(Optional) Sets the maximum hourly instance price. Supports up to three decimal places.
     */
    public readonly spotPriceLimit!: pulumi.Output<number | undefined>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Valid values: `NoSpot`, `SpotAsPriceGo`, `SpotWithPriceLimit`.
     */
    public readonly spotStrategy!: pulumi.Output<string | undefined>;
    /**
     * The System Disk.
     */
    public readonly systemDisk!: pulumi.Output<outputs.ecs.EcsLaunchTemplateSystemDisk>;
    /**
     * @deprecated Field 'system_disk_category' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    public readonly systemDiskCategory!: pulumi.Output<string>;
    /**
     * @deprecated Field 'system_disk_description' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    public readonly systemDiskDescription!: pulumi.Output<string>;
    /**
     * @deprecated Field 'system_disk_name' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    public readonly systemDiskName!: pulumi.Output<string>;
    /**
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
     * @deprecated Field 'userdata' has been deprecated from provider version 1.120.0. New field 'user_data' instead.
     */
    public readonly userdata!: pulumi.Output<string>;
    /**
     * The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    public readonly versionDescription!: pulumi.Output<string | undefined>;
    public readonly vpcId!: pulumi.Output<string | undefined>;
    /**
     * The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
     */
    public readonly vswitchId!: pulumi.Output<string | undefined>;
    /**
     * The zone ID of the instance.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a EcsLaunchTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EcsLaunchTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EcsLaunchTemplateArgs | EcsLaunchTemplateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EcsLaunchTemplateState | undefined;
            inputs["autoReleaseTime"] = state ? state.autoReleaseTime : undefined;
            inputs["dataDisks"] = state ? state.dataDisks : undefined;
            inputs["deploymentSetId"] = state ? state.deploymentSetId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["enableVmOsConfig"] = state ? state.enableVmOsConfig : undefined;
            inputs["hostName"] = state ? state.hostName : undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["imageOwnerAlias"] = state ? state.imageOwnerAlias : undefined;
            inputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            inputs["instanceName"] = state ? state.instanceName : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            inputs["internetMaxBandwidthIn"] = state ? state.internetMaxBandwidthIn : undefined;
            inputs["internetMaxBandwidthOut"] = state ? state.internetMaxBandwidthOut : undefined;
            inputs["ioOptimized"] = state ? state.ioOptimized : undefined;
            inputs["keyPairName"] = state ? state.keyPairName : undefined;
            inputs["launchTemplateName"] = state ? state.launchTemplateName : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            inputs["networkType"] = state ? state.networkType : undefined;
            inputs["passwordInherit"] = state ? state.passwordInherit : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["privateIpAddress"] = state ? state.privateIpAddress : undefined;
            inputs["ramRoleName"] = state ? state.ramRoleName : undefined;
            inputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            inputs["securityEnhancementStrategy"] = state ? state.securityEnhancementStrategy : undefined;
            inputs["securityGroupId"] = state ? state.securityGroupId : undefined;
            inputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            inputs["spotDuration"] = state ? state.spotDuration : undefined;
            inputs["spotPriceLimit"] = state ? state.spotPriceLimit : undefined;
            inputs["spotStrategy"] = state ? state.spotStrategy : undefined;
            inputs["systemDisk"] = state ? state.systemDisk : undefined;
            inputs["systemDiskCategory"] = state ? state.systemDiskCategory : undefined;
            inputs["systemDiskDescription"] = state ? state.systemDiskDescription : undefined;
            inputs["systemDiskName"] = state ? state.systemDiskName : undefined;
            inputs["systemDiskSize"] = state ? state.systemDiskSize : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["templateResourceGroupId"] = state ? state.templateResourceGroupId : undefined;
            inputs["templateTags"] = state ? state.templateTags : undefined;
            inputs["userData"] = state ? state.userData : undefined;
            inputs["userdata"] = state ? state.userdata : undefined;
            inputs["versionDescription"] = state ? state.versionDescription : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as EcsLaunchTemplateArgs | undefined;
            inputs["autoReleaseTime"] = args ? args.autoReleaseTime : undefined;
            inputs["dataDisks"] = args ? args.dataDisks : undefined;
            inputs["deploymentSetId"] = args ? args.deploymentSetId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["enableVmOsConfig"] = args ? args.enableVmOsConfig : undefined;
            inputs["hostName"] = args ? args.hostName : undefined;
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["imageOwnerAlias"] = args ? args.imageOwnerAlias : undefined;
            inputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            inputs["instanceName"] = args ? args.instanceName : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["internetChargeType"] = args ? args.internetChargeType : undefined;
            inputs["internetMaxBandwidthIn"] = args ? args.internetMaxBandwidthIn : undefined;
            inputs["internetMaxBandwidthOut"] = args ? args.internetMaxBandwidthOut : undefined;
            inputs["ioOptimized"] = args ? args.ioOptimized : undefined;
            inputs["keyPairName"] = args ? args.keyPairName : undefined;
            inputs["launchTemplateName"] = args ? args.launchTemplateName : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            inputs["networkType"] = args ? args.networkType : undefined;
            inputs["passwordInherit"] = args ? args.passwordInherit : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["privateIpAddress"] = args ? args.privateIpAddress : undefined;
            inputs["ramRoleName"] = args ? args.ramRoleName : undefined;
            inputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            inputs["securityEnhancementStrategy"] = args ? args.securityEnhancementStrategy : undefined;
            inputs["securityGroupId"] = args ? args.securityGroupId : undefined;
            inputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            inputs["spotDuration"] = args ? args.spotDuration : undefined;
            inputs["spotPriceLimit"] = args ? args.spotPriceLimit : undefined;
            inputs["spotStrategy"] = args ? args.spotStrategy : undefined;
            inputs["systemDisk"] = args ? args.systemDisk : undefined;
            inputs["systemDiskCategory"] = args ? args.systemDiskCategory : undefined;
            inputs["systemDiskDescription"] = args ? args.systemDiskDescription : undefined;
            inputs["systemDiskName"] = args ? args.systemDiskName : undefined;
            inputs["systemDiskSize"] = args ? args.systemDiskSize : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["templateResourceGroupId"] = args ? args.templateResourceGroupId : undefined;
            inputs["templateTags"] = args ? args.templateTags : undefined;
            inputs["userData"] = args ? args.userData : undefined;
            inputs["userdata"] = args ? args.userdata : undefined;
            inputs["versionDescription"] = args ? args.versionDescription : undefined;
            inputs["vpcId"] = args ? args.vpcId : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(EcsLaunchTemplate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EcsLaunchTemplate resources.
 */
export interface EcsLaunchTemplateState {
    /**
     * Instance auto release time. The time is presented using the ISO8601 standard and in UTC time. The format is  YYYY-MM-DDTHH:MM:SSZ.
     */
    readonly autoReleaseTime?: pulumi.Input<string>;
    /**
     * The list of data disks created with instance.
     */
    readonly dataDisks?: pulumi.Input<pulumi.Input<inputs.ecs.EcsLaunchTemplateDataDisk>[]>;
    /**
     * The Deployment Set Id.
     */
    readonly deploymentSetId?: pulumi.Input<string>;
    /**
     * The description of the data disk.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to enable the instance operating system configuration.
     */
    readonly enableVmOsConfig?: pulumi.Input<boolean>;
    /**
     * Instance host name.It cannot start or end with a period (.) or a hyphen (-) and it cannot have two or more consecutive periods (.) or hyphens (-).For Windows: The host name can be [2, 15] characters in length. It can contain A-Z, a-z, numbers, periods (.), and hyphens (-). It cannot only contain numbers. For other operating systems: The host name can be [2, 64] characters in length. It can be segments separated by periods (.). It can contain A-Z, a-z, numbers, and hyphens (-).
     */
    readonly hostName?: pulumi.Input<string>;
    /**
     * The Image ID.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * Mirror source. Valid values: `system`, `self`, `others`, `marketplace`, `""`. Default to: `""`.
     */
    readonly imageOwnerAlias?: pulumi.Input<string>;
    /**
     * Billing methods. Valid values: `PostPaid`, `PrePaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    readonly instanceName?: pulumi.Input<string>;
    /**
     * Instance type. For more information, call resourceAlicloudInstances to obtain the latest instance type list.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Internet bandwidth billing method. Valid values: `PayByTraffic`, `PayByBandwidth`.
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * The maximum inbound bandwidth from the Internet network, measured in Mbit/s. Value range: [1, 200].
     */
    readonly internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s. Value range: [0, 100].
     */
    readonly internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * Whether it is an I/O-optimized instance or not. Valid values: `none`, `optimized`.
     */
    readonly ioOptimized?: pulumi.Input<string>;
    /**
     * The name of the key pair.
     * - Ignore this parameter for Windows instances. It is null by default. Even if you enter this parameter, only the  Password content is used.
     * - The password logon method for Linux instances is set to forbidden upon initialization.
     */
    readonly keyPairName?: pulumi.Input<string>;
    /**
     * The name of Launch Template.
     */
    readonly launchTemplateName?: pulumi.Input<string>;
    /**
     * The name of the data disk.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'launch_template_name' instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The list of network interfaces created with instance.
     */
    readonly networkInterfaces?: pulumi.Input<inputs.ecs.EcsLaunchTemplateNetworkInterfaces>;
    /**
     * Network type of the instance. Valid values: `classic`, `vpc`.
     */
    readonly networkType?: pulumi.Input<string>;
    /**
     * Whether to use the password preset by the mirror.
     */
    readonly passwordInherit?: pulumi.Input<boolean>;
    /**
     * The subscription period of the instance. Unit: months. This parameter takes effect and is required only when InstanceChargeType is set to PrePaid. If the DedicatedHostId parameter is specified, the value of the Period parameter must be within the subscription period of the dedicated host.
     * - When the PeriodUnit parameter is set to `Week`, the valid values of the Period parameter are `1`, `2`, `3`, and `4`.
     * - When the PeriodUnit parameter is set to `Month`, the valid values of the Period parameter are `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, and `60`.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The private IP address of the instance.
     */
    readonly privateIpAddress?: pulumi.Input<string>;
    /**
     * The RAM role name of the instance. You can use the RAM API ListRoles to query instance RAM role names.
     */
    readonly ramRoleName?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which to assign the instance, Elastic Block Storage (EBS) device, and ENI.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * Whether or not to activate the security enhancement feature and install network security software free of charge. Valid values: `Active`, `Deactive`.
     */
    readonly securityEnhancementStrategy?: pulumi.Input<string>;
    /**
     * The security group ID must be one in the same VPC.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    /**
     * The ID of security group N to which to assign the instance.
     */
    readonly securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The protection period of the preemptible instance. Unit: hours. Valid values: `0`, `1`, `2`, `3`, `4`, `5`, and `6`. Default to: `1`.
     */
    readonly spotDuration?: pulumi.Input<string>;
    /**
     * -(Optional) Sets the maximum hourly instance price. Supports up to three decimal places.
     */
    readonly spotPriceLimit?: pulumi.Input<number>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Valid values: `NoSpot`, `SpotAsPriceGo`, `SpotWithPriceLimit`.
     */
    readonly spotStrategy?: pulumi.Input<string>;
    /**
     * The System Disk.
     */
    readonly systemDisk?: pulumi.Input<inputs.ecs.EcsLaunchTemplateSystemDisk>;
    /**
     * @deprecated Field 'system_disk_category' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    readonly systemDiskCategory?: pulumi.Input<string>;
    /**
     * @deprecated Field 'system_disk_description' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    readonly systemDiskDescription?: pulumi.Input<string>;
    /**
     * @deprecated Field 'system_disk_name' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    readonly systemDiskName?: pulumi.Input<string>;
    /**
     * @deprecated Field 'system_disk_size' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    readonly systemDiskSize?: pulumi.Input<number>;
    /**
     * A mapping of tags to assign to instance, block storage, and elastic network.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The template resource group id.
     */
    readonly templateResourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the launch template.
     */
    readonly templateTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The User Data.
     */
    readonly userData?: pulumi.Input<string>;
    /**
     * @deprecated Field 'userdata' has been deprecated from provider version 1.120.0. New field 'user_data' instead.
     */
    readonly userdata?: pulumi.Input<string>;
    /**
     * The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    readonly versionDescription?: pulumi.Input<string>;
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the instance.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EcsLaunchTemplate resource.
 */
export interface EcsLaunchTemplateArgs {
    /**
     * Instance auto release time. The time is presented using the ISO8601 standard and in UTC time. The format is  YYYY-MM-DDTHH:MM:SSZ.
     */
    readonly autoReleaseTime?: pulumi.Input<string>;
    /**
     * The list of data disks created with instance.
     */
    readonly dataDisks?: pulumi.Input<pulumi.Input<inputs.ecs.EcsLaunchTemplateDataDisk>[]>;
    /**
     * The Deployment Set Id.
     */
    readonly deploymentSetId?: pulumi.Input<string>;
    /**
     * The description of the data disk.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether to enable the instance operating system configuration.
     */
    readonly enableVmOsConfig?: pulumi.Input<boolean>;
    /**
     * Instance host name.It cannot start or end with a period (.) or a hyphen (-) and it cannot have two or more consecutive periods (.) or hyphens (-).For Windows: The host name can be [2, 15] characters in length. It can contain A-Z, a-z, numbers, periods (.), and hyphens (-). It cannot only contain numbers. For other operating systems: The host name can be [2, 64] characters in length. It can be segments separated by periods (.). It can contain A-Z, a-z, numbers, and hyphens (-).
     */
    readonly hostName?: pulumi.Input<string>;
    /**
     * The Image ID.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * Mirror source. Valid values: `system`, `self`, `others`, `marketplace`, `""`. Default to: `""`.
     */
    readonly imageOwnerAlias?: pulumi.Input<string>;
    /**
     * Billing methods. Valid values: `PostPaid`, `PrePaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    readonly instanceName?: pulumi.Input<string>;
    /**
     * Instance type. For more information, call resourceAlicloudInstances to obtain the latest instance type list.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Internet bandwidth billing method. Valid values: `PayByTraffic`, `PayByBandwidth`.
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * The maximum inbound bandwidth from the Internet network, measured in Mbit/s. Value range: [1, 200].
     */
    readonly internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outbound bandwidth from the Internet, its unit of measurement is Mbit/s. Value range: [0, 100].
     */
    readonly internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * Whether it is an I/O-optimized instance or not. Valid values: `none`, `optimized`.
     */
    readonly ioOptimized?: pulumi.Input<string>;
    /**
     * The name of the key pair.
     * - Ignore this parameter for Windows instances. It is null by default. Even if you enter this parameter, only the  Password content is used.
     * - The password logon method for Linux instances is set to forbidden upon initialization.
     */
    readonly keyPairName?: pulumi.Input<string>;
    /**
     * The name of Launch Template.
     */
    readonly launchTemplateName?: pulumi.Input<string>;
    /**
     * The name of the data disk.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'launch_template_name' instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The list of network interfaces created with instance.
     */
    readonly networkInterfaces?: pulumi.Input<inputs.ecs.EcsLaunchTemplateNetworkInterfaces>;
    /**
     * Network type of the instance. Valid values: `classic`, `vpc`.
     */
    readonly networkType?: pulumi.Input<string>;
    /**
     * Whether to use the password preset by the mirror.
     */
    readonly passwordInherit?: pulumi.Input<boolean>;
    /**
     * The subscription period of the instance. Unit: months. This parameter takes effect and is required only when InstanceChargeType is set to PrePaid. If the DedicatedHostId parameter is specified, the value of the Period parameter must be within the subscription period of the dedicated host.
     * - When the PeriodUnit parameter is set to `Week`, the valid values of the Period parameter are `1`, `2`, `3`, and `4`.
     * - When the PeriodUnit parameter is set to `Month`, the valid values of the Period parameter are `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`, `48`, and `60`.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * The private IP address of the instance.
     */
    readonly privateIpAddress?: pulumi.Input<string>;
    /**
     * The RAM role name of the instance. You can use the RAM API ListRoles to query instance RAM role names.
     */
    readonly ramRoleName?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which to assign the instance, Elastic Block Storage (EBS) device, and ENI.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * Whether or not to activate the security enhancement feature and install network security software free of charge. Valid values: `Active`, `Deactive`.
     */
    readonly securityEnhancementStrategy?: pulumi.Input<string>;
    /**
     * The security group ID must be one in the same VPC.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    /**
     * The ID of security group N to which to assign the instance.
     */
    readonly securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The protection period of the preemptible instance. Unit: hours. Valid values: `0`, `1`, `2`, `3`, `4`, `5`, and `6`. Default to: `1`.
     */
    readonly spotDuration?: pulumi.Input<string>;
    /**
     * -(Optional) Sets the maximum hourly instance price. Supports up to three decimal places.
     */
    readonly spotPriceLimit?: pulumi.Input<number>;
    /**
     * The spot strategy for a Pay-As-You-Go instance. This parameter is valid and required only when InstanceChargeType is set to PostPaid. Valid values: `NoSpot`, `SpotAsPriceGo`, `SpotWithPriceLimit`.
     */
    readonly spotStrategy?: pulumi.Input<string>;
    /**
     * The System Disk.
     */
    readonly systemDisk?: pulumi.Input<inputs.ecs.EcsLaunchTemplateSystemDisk>;
    /**
     * @deprecated Field 'system_disk_category' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    readonly systemDiskCategory?: pulumi.Input<string>;
    /**
     * @deprecated Field 'system_disk_description' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    readonly systemDiskDescription?: pulumi.Input<string>;
    /**
     * @deprecated Field 'system_disk_name' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    readonly systemDiskName?: pulumi.Input<string>;
    /**
     * @deprecated Field 'system_disk_size' has been deprecated from provider version 1.120.0. New field 'system_disk' instead.
     */
    readonly systemDiskSize?: pulumi.Input<number>;
    /**
     * A mapping of tags to assign to instance, block storage, and elastic network.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The template resource group id.
     */
    readonly templateResourceGroupId?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the launch template.
     */
    readonly templateTags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The User Data.
     */
    readonly userData?: pulumi.Input<string>;
    /**
     * @deprecated Field 'userdata' has been deprecated from provider version 1.120.0. New field 'user_data' instead.
     */
    readonly userdata?: pulumi.Input<string>;
    /**
     * The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     */
    readonly versionDescription?: pulumi.Input<string>;
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The VSwitch ID for ENI. The instance must be in the same zone of the same VPC network as the ENI, but they may belong to different VSwitches.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the instance.
     */
    readonly zoneId?: pulumi.Input<string>;
}