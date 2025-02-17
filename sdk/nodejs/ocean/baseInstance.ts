// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Ocean Base Instance resource.
 *
 * For information about Ocean Base Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/what-is-oceanbase-database).
 *
 * > **NOTE:** Available since v1.203.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const defaultZones = alicloud.getZones({});
 * const defaultResourceGroups = alicloud.resourcemanager.getResourceGroups({});
 * const defaultBaseInstance = new alicloud.ocean.BaseInstance("defaultBaseInstance", {
 *     resourceGroupId: defaultResourceGroups.then(defaultResourceGroups => defaultResourceGroups.ids?.[0]),
 *     zones: [
 *         Promise.all([defaultZones, defaultZones.then(defaultZones => defaultZones.ids).length]).then(([defaultZones, length]) => defaultZones.ids[length - 2]),
 *         Promise.all([defaultZones, defaultZones.then(defaultZones => defaultZones.ids).length]).then(([defaultZones, length]) => defaultZones.ids[length - 3]),
 *         Promise.all([defaultZones, defaultZones.then(defaultZones => defaultZones.ids).length]).then(([defaultZones, length]) => defaultZones.ids[length - 4]),
 *     ],
 *     autoRenew: false,
 *     diskSize: 100,
 *     paymentType: "PayAsYouGo",
 *     instanceClass: "8C32GB",
 *     backupRetainMode: "delete_all",
 *     series: "normal",
 *     instanceName: name,
 * });
 * ```
 *
 * ## Import
 *
 * Ocean Base Instance can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:ocean/baseInstance:BaseInstance example <id>
 * ```
 */
export class BaseInstance extends pulumi.CustomResource {
    /**
     * Get an existing BaseInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BaseInstanceState, opts?: pulumi.CustomResourceOptions): BaseInstance {
        return new BaseInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ocean/baseInstance:BaseInstance';

    /**
     * Returns true if the given object is an instance of BaseInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BaseInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BaseInstance.__pulumiType;
    }

    /**
     * Whether to automatically renew.
     * It takes effect when the parameter ChargeType is PrePaid. Value range:
     * - true: automatic renewal.
     * - false (default): no automatic renewal.
     */
    public readonly autoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * The duration of each auto-renewal. When the value of the AutoRenew parameter is True, this parameter is required.
     * - PeriodUnit is Week, AutoRenewPeriod is {"1", "2", "3"}.
     * - PeriodUnit is Month, AutoRenewPeriod is {"1", "2", "3", "6", "12"}.
     */
    public readonly autoRenewPeriod!: pulumi.Output<number | undefined>;
    /**
     * The backup retention policy after the cluster is deleted. The values are as follows:
     * - receive_all: Keep all backup sets;
     * - delete_all: delete all backup sets;
     * - receive_last: Keep the last backup set.
     * > **NOTE:**   The default value is delete_all.
     */
    public readonly backupRetainMode!: pulumi.Output<string | undefined>;
    /**
     * The product code of the OceanBase cluster._oceanbasepre_public_cn: Domestic station cloud database package Year-to-month package._oceanbasepost_public_cn: The domestic station cloud database is paid by the hour._obpre_public_intl: International Station Cloud Database Package Monthly Package.
     */
    public /*out*/ readonly commodityCode!: pulumi.Output<string>;
    /**
     * The number of CPU cores of the cluster.
     */
    public /*out*/ readonly cpu!: pulumi.Output<number>;
    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The size of the storage space, in GB.
     * The limits of storage space vary according to the cluster specifications, as follows:
     * - 8C32GB:100GB ~ 10000GB
     * - 14C70GB:200GB ~ 10000GB
     * - 30C180GB:400GB ~ 10000GB
     * - 62C400G:800GB ~ 10000GB.
     * The default value of each package is its minimum value.
     */
    public readonly diskSize!: pulumi.Output<number>;
    /**
     * The storage type of the cluster. Effective only in the standard cluster version (cloud disk).
     * Two types are currently supported:
     * - cloud_essd_pl1: cloud disk ESSD pl1.
     * - cloud_essd_pl0: cloud disk ESSD pl0. The default value is cloud_essd_pl1.
     */
    public readonly diskType!: pulumi.Output<string>;
    /**
     * Cluster specification information.
     * Four packages are currently supported:
     * - 4C16GB：4cores 16GB
     * - 8C32GB：8cores 32GB
     * - 14C70GB：14cores 70GB
     * - 24C120GB：24cores 120GB
     * - 30C180GB：30cores 180GB
     * - 62C400GB：62cores 400GB
     * - 104C600GB：104cores 600GB
     * - 16C70GB：16cores 70GB
     * - 32C160GB：32cores 160GB
     * - 64C380GB：64cores 380GB
     * - 20C32GB：20cores 32GB
     * - 40C64GB：40cores 64GB
     * - 16C32GB：16cores 32GB
     * - 32C70GB：32cores 70GB
     * - 64C180GB：64cores 180GB
     * - 32C180GB：32cores 180GB
     * - 64C400GB：64cores 400GB.
     */
    public readonly instanceClass!: pulumi.Output<string>;
    /**
     * OceanBase cluster name.The length is 1 to 20 English or Chinese characters.If this parameter is not specified, the default value is the InstanceId of the cluster.
     */
    public readonly instanceName!: pulumi.Output<string>;
    /**
     * The number of nodes in the cluster. If the deployment mode is n-n-n, the number of nodes is n * 3.
     */
    public readonly nodeNum!: pulumi.Output<string>;
    /**
     * The OceanBase Server version number.
     */
    public readonly obVersion!: pulumi.Output<string>;
    /**
     * The payment method of the instance. Value range:
     * - Subscription: Package year and month. When you select this type of payment method, you must make sure that your account supports balance payment or credit payment. Otherwise, an InvalidPayMethod error message will be returned.
     * - PayAsYouGo (default): Pay-as-you-go (default hourly billing).
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The duration of the resource purchase. The unit is specified by the PeriodUnit. The parameter InstanceChargeType takes effect only when the value is PrePaid and is required. Once the DedicatedHostId is specified, the value cannot exceed the subscription duration of the dedicated host. When PeriodUnit = Week, Period values: {"1", "2", "3", "4"}. When PeriodUnit = Month, Period values: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The duration of the purchase of resources.Package year and Month value range: Month.Default value: Month of the package, which is billed by volume. The default period is Hour.
     */
    public readonly periodUnit!: pulumi.Output<string | undefined>;
    /**
     * The ID of the enterprise resource group to which the instance resides.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * Series of OceanBase cluster instances-normal (default): Standard cluster version (cloud disk)-normal_SSD: Standard cluster version (local disk)-history: history Library cluster version.
     */
    public readonly series!: pulumi.Output<string>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Information about the zone where the cluster is deployed.
     */
    public readonly zones!: pulumi.Output<string[]>;

    /**
     * Create a BaseInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BaseInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BaseInstanceArgs | BaseInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BaseInstanceState | undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["autoRenewPeriod"] = state ? state.autoRenewPeriod : undefined;
            resourceInputs["backupRetainMode"] = state ? state.backupRetainMode : undefined;
            resourceInputs["commodityCode"] = state ? state.commodityCode : undefined;
            resourceInputs["cpu"] = state ? state.cpu : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["diskSize"] = state ? state.diskSize : undefined;
            resourceInputs["diskType"] = state ? state.diskType : undefined;
            resourceInputs["instanceClass"] = state ? state.instanceClass : undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["nodeNum"] = state ? state.nodeNum : undefined;
            resourceInputs["obVersion"] = state ? state.obVersion : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["periodUnit"] = state ? state.periodUnit : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["series"] = state ? state.series : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["zones"] = state ? state.zones : undefined;
        } else {
            const args = argsOrState as BaseInstanceArgs | undefined;
            if ((!args || args.diskSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'diskSize'");
            }
            if ((!args || args.instanceClass === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceClass'");
            }
            if ((!args || args.paymentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentType'");
            }
            if ((!args || args.series === undefined) && !opts.urn) {
                throw new Error("Missing required property 'series'");
            }
            if ((!args || args.zones === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zones'");
            }
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["autoRenewPeriod"] = args ? args.autoRenewPeriod : undefined;
            resourceInputs["backupRetainMode"] = args ? args.backupRetainMode : undefined;
            resourceInputs["diskSize"] = args ? args.diskSize : undefined;
            resourceInputs["diskType"] = args ? args.diskType : undefined;
            resourceInputs["instanceClass"] = args ? args.instanceClass : undefined;
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["nodeNum"] = args ? args.nodeNum : undefined;
            resourceInputs["obVersion"] = args ? args.obVersion : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["periodUnit"] = args ? args.periodUnit : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["series"] = args ? args.series : undefined;
            resourceInputs["zones"] = args ? args.zones : undefined;
            resourceInputs["commodityCode"] = undefined /*out*/;
            resourceInputs["cpu"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BaseInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BaseInstance resources.
 */
export interface BaseInstanceState {
    /**
     * Whether to automatically renew.
     * It takes effect when the parameter ChargeType is PrePaid. Value range:
     * - true: automatic renewal.
     * - false (default): no automatic renewal.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The duration of each auto-renewal. When the value of the AutoRenew parameter is True, this parameter is required.
     * - PeriodUnit is Week, AutoRenewPeriod is {"1", "2", "3"}.
     * - PeriodUnit is Month, AutoRenewPeriod is {"1", "2", "3", "6", "12"}.
     */
    autoRenewPeriod?: pulumi.Input<number>;
    /**
     * The backup retention policy after the cluster is deleted. The values are as follows:
     * - receive_all: Keep all backup sets;
     * - delete_all: delete all backup sets;
     * - receive_last: Keep the last backup set.
     * > **NOTE:**   The default value is delete_all.
     */
    backupRetainMode?: pulumi.Input<string>;
    /**
     * The product code of the OceanBase cluster._oceanbasepre_public_cn: Domestic station cloud database package Year-to-month package._oceanbasepost_public_cn: The domestic station cloud database is paid by the hour._obpre_public_intl: International Station Cloud Database Package Monthly Package.
     */
    commodityCode?: pulumi.Input<string>;
    /**
     * The number of CPU cores of the cluster.
     */
    cpu?: pulumi.Input<number>;
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The size of the storage space, in GB.
     * The limits of storage space vary according to the cluster specifications, as follows:
     * - 8C32GB:100GB ~ 10000GB
     * - 14C70GB:200GB ~ 10000GB
     * - 30C180GB:400GB ~ 10000GB
     * - 62C400G:800GB ~ 10000GB.
     * The default value of each package is its minimum value.
     */
    diskSize?: pulumi.Input<number>;
    /**
     * The storage type of the cluster. Effective only in the standard cluster version (cloud disk).
     * Two types are currently supported:
     * - cloud_essd_pl1: cloud disk ESSD pl1.
     * - cloud_essd_pl0: cloud disk ESSD pl0. The default value is cloud_essd_pl1.
     */
    diskType?: pulumi.Input<string>;
    /**
     * Cluster specification information.
     * Four packages are currently supported:
     * - 4C16GB：4cores 16GB
     * - 8C32GB：8cores 32GB
     * - 14C70GB：14cores 70GB
     * - 24C120GB：24cores 120GB
     * - 30C180GB：30cores 180GB
     * - 62C400GB：62cores 400GB
     * - 104C600GB：104cores 600GB
     * - 16C70GB：16cores 70GB
     * - 32C160GB：32cores 160GB
     * - 64C380GB：64cores 380GB
     * - 20C32GB：20cores 32GB
     * - 40C64GB：40cores 64GB
     * - 16C32GB：16cores 32GB
     * - 32C70GB：32cores 70GB
     * - 64C180GB：64cores 180GB
     * - 32C180GB：32cores 180GB
     * - 64C400GB：64cores 400GB.
     */
    instanceClass?: pulumi.Input<string>;
    /**
     * OceanBase cluster name.The length is 1 to 20 English or Chinese characters.If this parameter is not specified, the default value is the InstanceId of the cluster.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * The number of nodes in the cluster. If the deployment mode is n-n-n, the number of nodes is n * 3.
     */
    nodeNum?: pulumi.Input<string>;
    /**
     * The OceanBase Server version number.
     */
    obVersion?: pulumi.Input<string>;
    /**
     * The payment method of the instance. Value range:
     * - Subscription: Package year and month. When you select this type of payment method, you must make sure that your account supports balance payment or credit payment. Otherwise, an InvalidPayMethod error message will be returned.
     * - PayAsYouGo (default): Pay-as-you-go (default hourly billing).
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The duration of the resource purchase. The unit is specified by the PeriodUnit. The parameter InstanceChargeType takes effect only when the value is PrePaid and is required. Once the DedicatedHostId is specified, the value cannot exceed the subscription duration of the dedicated host. When PeriodUnit = Week, Period values: {"1", "2", "3", "4"}. When PeriodUnit = Month, Period values: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
     */
    period?: pulumi.Input<number>;
    /**
     * The duration of the purchase of resources.Package year and Month value range: Month.Default value: Month of the package, which is billed by volume. The default period is Hour.
     */
    periodUnit?: pulumi.Input<string>;
    /**
     * The ID of the enterprise resource group to which the instance resides.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Series of OceanBase cluster instances-normal (default): Standard cluster version (cloud disk)-normal_SSD: Standard cluster version (local disk)-history: history Library cluster version.
     */
    series?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * Information about the zone where the cluster is deployed.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a BaseInstance resource.
 */
export interface BaseInstanceArgs {
    /**
     * Whether to automatically renew.
     * It takes effect when the parameter ChargeType is PrePaid. Value range:
     * - true: automatic renewal.
     * - false (default): no automatic renewal.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The duration of each auto-renewal. When the value of the AutoRenew parameter is True, this parameter is required.
     * - PeriodUnit is Week, AutoRenewPeriod is {"1", "2", "3"}.
     * - PeriodUnit is Month, AutoRenewPeriod is {"1", "2", "3", "6", "12"}.
     */
    autoRenewPeriod?: pulumi.Input<number>;
    /**
     * The backup retention policy after the cluster is deleted. The values are as follows:
     * - receive_all: Keep all backup sets;
     * - delete_all: delete all backup sets;
     * - receive_last: Keep the last backup set.
     * > **NOTE:**   The default value is delete_all.
     */
    backupRetainMode?: pulumi.Input<string>;
    /**
     * The size of the storage space, in GB.
     * The limits of storage space vary according to the cluster specifications, as follows:
     * - 8C32GB:100GB ~ 10000GB
     * - 14C70GB:200GB ~ 10000GB
     * - 30C180GB:400GB ~ 10000GB
     * - 62C400G:800GB ~ 10000GB.
     * The default value of each package is its minimum value.
     */
    diskSize: pulumi.Input<number>;
    /**
     * The storage type of the cluster. Effective only in the standard cluster version (cloud disk).
     * Two types are currently supported:
     * - cloud_essd_pl1: cloud disk ESSD pl1.
     * - cloud_essd_pl0: cloud disk ESSD pl0. The default value is cloud_essd_pl1.
     */
    diskType?: pulumi.Input<string>;
    /**
     * Cluster specification information.
     * Four packages are currently supported:
     * - 4C16GB：4cores 16GB
     * - 8C32GB：8cores 32GB
     * - 14C70GB：14cores 70GB
     * - 24C120GB：24cores 120GB
     * - 30C180GB：30cores 180GB
     * - 62C400GB：62cores 400GB
     * - 104C600GB：104cores 600GB
     * - 16C70GB：16cores 70GB
     * - 32C160GB：32cores 160GB
     * - 64C380GB：64cores 380GB
     * - 20C32GB：20cores 32GB
     * - 40C64GB：40cores 64GB
     * - 16C32GB：16cores 32GB
     * - 32C70GB：32cores 70GB
     * - 64C180GB：64cores 180GB
     * - 32C180GB：32cores 180GB
     * - 64C400GB：64cores 400GB.
     */
    instanceClass: pulumi.Input<string>;
    /**
     * OceanBase cluster name.The length is 1 to 20 English or Chinese characters.If this parameter is not specified, the default value is the InstanceId of the cluster.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * The number of nodes in the cluster. If the deployment mode is n-n-n, the number of nodes is n * 3.
     */
    nodeNum?: pulumi.Input<string>;
    /**
     * The OceanBase Server version number.
     */
    obVersion?: pulumi.Input<string>;
    /**
     * The payment method of the instance. Value range:
     * - Subscription: Package year and month. When you select this type of payment method, you must make sure that your account supports balance payment or credit payment. Otherwise, an InvalidPayMethod error message will be returned.
     * - PayAsYouGo (default): Pay-as-you-go (default hourly billing).
     */
    paymentType: pulumi.Input<string>;
    /**
     * The duration of the resource purchase. The unit is specified by the PeriodUnit. The parameter InstanceChargeType takes effect only when the value is PrePaid and is required. Once the DedicatedHostId is specified, the value cannot exceed the subscription duration of the dedicated host. When PeriodUnit = Week, Period values: {"1", "2", "3", "4"}. When PeriodUnit = Month, Period values: {"1", "2", "3", "4", "5", "6", "7", "8", "9", "12", "24", "36", "48", "60"}.
     */
    period?: pulumi.Input<number>;
    /**
     * The duration of the purchase of resources.Package year and Month value range: Month.Default value: Month of the package, which is billed by volume. The default period is Hour.
     */
    periodUnit?: pulumi.Input<string>;
    /**
     * The ID of the enterprise resource group to which the instance resides.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Series of OceanBase cluster instances-normal (default): Standard cluster version (cloud disk)-normal_SSD: Standard cluster version (local disk)-history: history Library cluster version.
     */
    series: pulumi.Input<string>;
    /**
     * Information about the zone where the cluster is deployed.
     */
    zones: pulumi.Input<pulumi.Input<string>[]>;
}
