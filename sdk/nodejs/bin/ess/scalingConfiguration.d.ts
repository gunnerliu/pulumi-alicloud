import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a ESS scaling configuration resource.
 *
 * ~> **NOTE:** Several instance types have outdated in some regions and availability zones, such as `ecs.t1.*`, `ecs.s2.*`, `ecs.n1.*` and so on. If you want to keep them, you should set `is_outdated` to true. For more about the upgraded instance type, refer to `alicloud_instance_types` datasource.
 */
export declare class ScalingConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing ScalingConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScalingConfigurationState): ScalingConfiguration;
    /**
     * Whether active current scaling configuration in the specified scaling group. Default to `false`.
     */
    readonly active: pulumi.Output<boolean>;
    /**
     * DataDisk mappings to attach to ecs instance. See Block datadisk below for details.
     */
    readonly dataDisks: pulumi.Output<{
        category?: string;
        deleteWithInstance?: boolean;
        device?: string;
        size?: number;
        snapshotId?: string;
    }[] | undefined>;
    /**
     * Whether enable the specified scaling group(make it active) to which the current scaling configuration belongs.
     */
    readonly enable: pulumi.Output<boolean | undefined>;
    /**
     * The last scaling configuration will be deleted forcibly with deleting its scaling group. Default to false.
     */
    readonly forceDelete: pulumi.Output<boolean | undefined>;
    /**
     * ID of an image file, indicating the image resource selected when an instance is enabled.
     */
    readonly imageId: pulumi.Output<string>;
    /**
     * It has been deprecated from version 1.6.0. New resource `alicloud_ess_attachment` replaces it.
     */
    readonly instanceIds: pulumi.Output<string[] | undefined>;
    /**
     * Name of an ECS instance. Default to "ESS-Instance". It is valid from version 1.7.1.
     */
    readonly instanceName: pulumi.Output<string | undefined>;
    /**
     * Resource type of an ECS instance.
     */
    readonly instanceType: pulumi.Output<string>;
    /**
     * Network billing type, Values: PayByBandwidth or PayByTraffic. Default to `PayByBandwidth`.
     */
    readonly internetChargeType: pulumi.Output<string | undefined>;
    /**
     * Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). The value range is [1,200].
     */
    readonly internetMaxBandwidthIn: pulumi.Output<number>;
    /**
     * Maximum outgoing bandwidth from the public network, measured in Mbps (Mega bit per second). The value range for PayByBandwidth is [0,100].
     */
    readonly internetMaxBandwidthOut: pulumi.Output<number | undefined>;
    /**
     * It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
     */
    readonly ioOptimized: pulumi.Output<string | undefined>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated: pulumi.Output<boolean | undefined>;
    /**
     * The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
     */
    readonly keyName: pulumi.Output<string | undefined>;
    /**
     * Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud_ram_role` to create a new one.
     */
    readonly roleName: pulumi.Output<string | undefined>;
    /**
     * Name shown for the scheduled task. If this parameter value is not specified, the default value is ScalingConfigurationId.
     */
    readonly scalingConfigurationName: pulumi.Output<string>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    readonly scalingGroupId: pulumi.Output<string>;
    /**
     * ID of the security group to which a newly created instance belongs.
     */
    readonly securityGroupId: pulumi.Output<string>;
    /**
     * The another scaling configuration which will be active automatically and replace current configuration when setting `active` to 'false'. It is invalid when `active` is 'true'
     */
    readonly substitute: pulumi.Output<string>;
    /**
     * Category of the system disk. The parameter value options are `cloud_efficiency`, `cloud_ssd` and `cloud`. `cloud` only is used to some no I/O optimized instance. Default to `cloud_efficiency`.
     */
    readonly systemDiskCategory: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the resource. It will be applied for ECS instances finally.
     */
    readonly tags: pulumi.Output<{
        [key: string]: any;
    } | undefined>;
    /**
     * User-defined data to customize the startup behaviors of the ECS instance and to pass data into the ECS instance.
     */
    readonly userData: pulumi.Output<string | undefined>;
    /**
     * Create a ScalingConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScalingConfigurationArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ScalingConfiguration resources.
 */
export interface ScalingConfigurationState {
    /**
     * Whether active current scaling configuration in the specified scaling group. Default to `false`.
     */
    readonly active?: pulumi.Input<boolean>;
    /**
     * DataDisk mappings to attach to ecs instance. See Block datadisk below for details.
     */
    readonly dataDisks?: pulumi.Input<pulumi.Input<{
        category?: pulumi.Input<string>;
        deleteWithInstance?: pulumi.Input<boolean>;
        device?: pulumi.Input<string>;
        size?: pulumi.Input<number>;
        snapshotId?: pulumi.Input<string>;
    }>[]>;
    /**
     * Whether enable the specified scaling group(make it active) to which the current scaling configuration belongs.
     */
    readonly enable?: pulumi.Input<boolean>;
    /**
     * The last scaling configuration will be deleted forcibly with deleting its scaling group. Default to false.
     */
    readonly forceDelete?: pulumi.Input<boolean>;
    /**
     * ID of an image file, indicating the image resource selected when an instance is enabled.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.6.0. New resource `alicloud_ess_attachment` replaces it.
     */
    readonly instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of an ECS instance. Default to "ESS-Instance". It is valid from version 1.7.1.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * Resource type of an ECS instance.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * Network billing type, Values: PayByBandwidth or PayByTraffic. Default to `PayByBandwidth`.
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). The value range is [1,200].
     */
    readonly internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outgoing bandwidth from the public network, measured in Mbps (Mega bit per second). The value range for PayByBandwidth is [0,100].
     */
    readonly internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
     */
    readonly ioOptimized?: pulumi.Input<string>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated?: pulumi.Input<boolean>;
    /**
     * The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud_ram_role` to create a new one.
     */
    readonly roleName?: pulumi.Input<string>;
    /**
     * Name shown for the scheduled task. If this parameter value is not specified, the default value is ScalingConfigurationId.
     */
    readonly scalingConfigurationName?: pulumi.Input<string>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    readonly scalingGroupId?: pulumi.Input<string>;
    /**
     * ID of the security group to which a newly created instance belongs.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    /**
     * The another scaling configuration which will be active automatically and replace current configuration when setting `active` to 'false'. It is invalid when `active` is 'true'
     */
    readonly substitute?: pulumi.Input<string>;
    /**
     * Category of the system disk. The parameter value options are `cloud_efficiency`, `cloud_ssd` and `cloud`. `cloud` only is used to some no I/O optimized instance. Default to `cloud_efficiency`.
     */
    readonly systemDiskCategory?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource. It will be applied for ECS instances finally.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * User-defined data to customize the startup behaviors of the ECS instance and to pass data into the ECS instance.
     */
    readonly userData?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ScalingConfiguration resource.
 */
export interface ScalingConfigurationArgs {
    /**
     * Whether active current scaling configuration in the specified scaling group. Default to `false`.
     */
    readonly active?: pulumi.Input<boolean>;
    /**
     * DataDisk mappings to attach to ecs instance. See Block datadisk below for details.
     */
    readonly dataDisks?: pulumi.Input<pulumi.Input<{
        category?: pulumi.Input<string>;
        deleteWithInstance?: pulumi.Input<boolean>;
        device?: pulumi.Input<string>;
        size?: pulumi.Input<number>;
        snapshotId?: pulumi.Input<string>;
    }>[]>;
    /**
     * Whether enable the specified scaling group(make it active) to which the current scaling configuration belongs.
     */
    readonly enable?: pulumi.Input<boolean>;
    /**
     * The last scaling configuration will be deleted forcibly with deleting its scaling group. Default to false.
     */
    readonly forceDelete?: pulumi.Input<boolean>;
    /**
     * ID of an image file, indicating the image resource selected when an instance is enabled.
     */
    readonly imageId: pulumi.Input<string>;
    /**
     * It has been deprecated from version 1.6.0. New resource `alicloud_ess_attachment` replaces it.
     */
    readonly instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of an ECS instance. Default to "ESS-Instance". It is valid from version 1.7.1.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * Resource type of an ECS instance.
     */
    readonly instanceType: pulumi.Input<string>;
    /**
     * Network billing type, Values: PayByBandwidth or PayByTraffic. Default to `PayByBandwidth`.
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * Maximum incoming bandwidth from the public network, measured in Mbps (Mega bit per second). The value range is [1,200].
     */
    readonly internetMaxBandwidthIn?: pulumi.Input<number>;
    /**
     * Maximum outgoing bandwidth from the public network, measured in Mbps (Mega bit per second). The value range for PayByBandwidth is [0,100].
     */
    readonly internetMaxBandwidthOut?: pulumi.Input<number>;
    /**
     * It has been deprecated on instance resource. All the launched alicloud instances will be I/O optimized.
     */
    readonly ioOptimized?: pulumi.Input<string>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated?: pulumi.Input<boolean>;
    /**
     * The name of key pair that can login ECS instance successfully without password. If it is specified, the password would be invalid.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * Instance RAM role name. The name is provided and maintained by RAM. You can use `alicloud_ram_role` to create a new one.
     */
    readonly roleName?: pulumi.Input<string>;
    /**
     * Name shown for the scheduled task. If this parameter value is not specified, the default value is ScalingConfigurationId.
     */
    readonly scalingConfigurationName?: pulumi.Input<string>;
    /**
     * ID of the scaling group of a scaling configuration.
     */
    readonly scalingGroupId: pulumi.Input<string>;
    /**
     * ID of the security group to which a newly created instance belongs.
     */
    readonly securityGroupId: pulumi.Input<string>;
    /**
     * The another scaling configuration which will be active automatically and replace current configuration when setting `active` to 'false'. It is invalid when `active` is 'true'
     */
    readonly substitute?: pulumi.Input<string>;
    /**
     * Category of the system disk. The parameter value options are `cloud_efficiency`, `cloud_ssd` and `cloud`. `cloud` only is used to some no I/O optimized instance. Default to `cloud_efficiency`.
     */
    readonly systemDiskCategory?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource. It will be applied for ECS instances finally.
     */
    readonly tags?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * User-defined data to customize the startup behaviors of the ECS instance and to pass data into the ECS instance.
     */
    readonly userData?: pulumi.Input<string>;
}