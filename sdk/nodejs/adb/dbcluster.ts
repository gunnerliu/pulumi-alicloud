// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a AnalyticDB for MySQL (ADB) DBCluster resource.
 *
 * For information about AnalyticDB for MySQL (ADB) DBCluster and how to use it, see [What is DBCluster](https://www.alibabacloud.com/help/en/doc-detail/190519.htm).
 *
 * > **NOTE:** Available in v1.121.0+.
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
 * const name = config.get("name") || "adbClusterconfig";
 * const creation = config.get("creation") || "ADB";
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: creation,
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones[0].id),
 *     vswitchName: name,
 * });
 * const _this = new alicloud.adb.DBCluster("this", {
 *     dbClusterCategory: "Cluster",
 *     dbClusterClass: "C8",
 *     dbNodeCount: "4",
 *     dbNodeStorage: "400",
 *     mode: "reserver",
 *     dbClusterVersion: "3.0",
 *     paymentType: "PayAsYouGo",
 *     vswitchId: defaultSwitch.id,
 *     description: "Test new adb again.",
 *     maintainTime: "23:00Z-00:00Z",
 *     tags: {
 *         Created: "TF-update",
 *         For: "acceptance-test-update",
 *     },
 *     resourceGroupId: "rg-aek2s7ylxx6****",
 *     securityIps: [
 *         "10.168.1.12",
 *         "10.168.1.11",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * AnalyticDB for MySQL (ADB) DBCluster can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:adb/dBCluster:DBCluster example <id>
 * ```
 */
export class DBCluster extends pulumi.CustomResource {
    /**
     * Get an existing DBCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DBClusterState, opts?: pulumi.CustomResourceOptions): DBCluster {
        return new DBCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:adb/dBCluster:DBCluster';

    /**
     * Returns true if the given object is an instance of DBCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DBCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DBCluster.__pulumiType;
    }

    /**
     * Auto-renewal period of an cluster, in the unit of the month. It is valid when `paymentType` is `Subscription`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`. Default to `1`.
     */
    public readonly autoRenewPeriod!: pulumi.Output<number | undefined>;
    /**
     * The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [ComputeResource](https://www.alibabacloud.com/help/en/doc-detail/144851.htm)
     */
    public readonly computeResource!: pulumi.Output<string | undefined>;
    /**
     * The endpoint of the cluster.
     */
    public /*out*/ readonly connectionString!: pulumi.Output<string>;
    /**
     * The db cluster category. Valid values: `Basic`, `Cluster`, `MixedStorage`.
     */
    public readonly dbClusterCategory!: pulumi.Output<string>;
    /**
     * The db cluster class. For more information, see [DBClusterClass](https://help.aliyun.com/document_detail/190519.html)
     */
    public readonly dbClusterClass!: pulumi.Output<string | undefined>;
    /**
     * The db cluster version. Value options: `3.0`, Default to `3.0`.
     */
    public readonly dbClusterVersion!: pulumi.Output<string | undefined>;
    /**
     * The db node class.
     */
    public readonly dbNodeClass!: pulumi.Output<string>;
    /**
     * The db node count.
     */
    public readonly dbNodeCount!: pulumi.Output<number | undefined>;
    /**
     * The db node storage.
     */
    public readonly dbNodeStorage!: pulumi.Output<number | undefined>;
    /**
     * The description of DBCluster.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The elastic io resource.
     */
    public readonly elasticIoResource!: pulumi.Output<number | undefined>;
    /**
     * The maintenance window of the cluster. Format: hh:mmZ-hh:mmZ.
     */
    public readonly maintainTime!: pulumi.Output<string>;
    /**
     * The mode of the cluster. Valid values: `reserver`, `flexible`.
     */
    public readonly mode!: pulumi.Output<string | undefined>;
    /**
     * The modify type.
     */
    public readonly modifyType!: pulumi.Output<string | undefined>;
    /**
     * Field `payType` has been deprecated. New field `paymentType` instead.
     */
    public readonly payType!: pulumi.Output<string>;
    /**
     * The payment type of the resource. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The duration that you will buy DB cluster (in month). It is valid when `paymentType` is `Subscription`. Valid values: [1~9], 12, 24, 36. Default to 1.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
     */
    public readonly renewalStatus!: pulumi.Output<string | undefined>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    public readonly securityIps!: pulumi.Output<string[]>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The vswitch id.
     */
    public readonly vswitchId!: pulumi.Output<string | undefined>;
    /**
     * The zone ID of the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a DBCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DBClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DBClusterArgs | DBClusterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DBClusterState | undefined;
            inputs["autoRenewPeriod"] = state ? state.autoRenewPeriod : undefined;
            inputs["computeResource"] = state ? state.computeResource : undefined;
            inputs["connectionString"] = state ? state.connectionString : undefined;
            inputs["dbClusterCategory"] = state ? state.dbClusterCategory : undefined;
            inputs["dbClusterClass"] = state ? state.dbClusterClass : undefined;
            inputs["dbClusterVersion"] = state ? state.dbClusterVersion : undefined;
            inputs["dbNodeClass"] = state ? state.dbNodeClass : undefined;
            inputs["dbNodeCount"] = state ? state.dbNodeCount : undefined;
            inputs["dbNodeStorage"] = state ? state.dbNodeStorage : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["elasticIoResource"] = state ? state.elasticIoResource : undefined;
            inputs["maintainTime"] = state ? state.maintainTime : undefined;
            inputs["mode"] = state ? state.mode : undefined;
            inputs["modifyType"] = state ? state.modifyType : undefined;
            inputs["payType"] = state ? state.payType : undefined;
            inputs["paymentType"] = state ? state.paymentType : undefined;
            inputs["period"] = state ? state.period : undefined;
            inputs["renewalStatus"] = state ? state.renewalStatus : undefined;
            inputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            inputs["securityIps"] = state ? state.securityIps : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as DBClusterArgs | undefined;
            if ((!args || args.dbClusterCategory === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbClusterCategory'");
            }
            inputs["autoRenewPeriod"] = args ? args.autoRenewPeriod : undefined;
            inputs["computeResource"] = args ? args.computeResource : undefined;
            inputs["dbClusterCategory"] = args ? args.dbClusterCategory : undefined;
            inputs["dbClusterClass"] = args ? args.dbClusterClass : undefined;
            inputs["dbClusterVersion"] = args ? args.dbClusterVersion : undefined;
            inputs["dbNodeClass"] = args ? args.dbNodeClass : undefined;
            inputs["dbNodeCount"] = args ? args.dbNodeCount : undefined;
            inputs["dbNodeStorage"] = args ? args.dbNodeStorage : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["elasticIoResource"] = args ? args.elasticIoResource : undefined;
            inputs["maintainTime"] = args ? args.maintainTime : undefined;
            inputs["mode"] = args ? args.mode : undefined;
            inputs["modifyType"] = args ? args.modifyType : undefined;
            inputs["payType"] = args ? args.payType : undefined;
            inputs["paymentType"] = args ? args.paymentType : undefined;
            inputs["period"] = args ? args.period : undefined;
            inputs["renewalStatus"] = args ? args.renewalStatus : undefined;
            inputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            inputs["securityIps"] = args ? args.securityIps : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["connectionString"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(DBCluster.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DBCluster resources.
 */
export interface DBClusterState {
    /**
     * Auto-renewal period of an cluster, in the unit of the month. It is valid when `paymentType` is `Subscription`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`. Default to `1`.
     */
    readonly autoRenewPeriod?: pulumi.Input<number>;
    /**
     * The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [ComputeResource](https://www.alibabacloud.com/help/en/doc-detail/144851.htm)
     */
    readonly computeResource?: pulumi.Input<string>;
    /**
     * The endpoint of the cluster.
     */
    readonly connectionString?: pulumi.Input<string>;
    /**
     * The db cluster category. Valid values: `Basic`, `Cluster`, `MixedStorage`.
     */
    readonly dbClusterCategory?: pulumi.Input<string>;
    /**
     * The db cluster class. For more information, see [DBClusterClass](https://help.aliyun.com/document_detail/190519.html)
     */
    readonly dbClusterClass?: pulumi.Input<string>;
    /**
     * The db cluster version. Value options: `3.0`, Default to `3.0`.
     */
    readonly dbClusterVersion?: pulumi.Input<string>;
    /**
     * The db node class.
     */
    readonly dbNodeClass?: pulumi.Input<string>;
    /**
     * The db node count.
     */
    readonly dbNodeCount?: pulumi.Input<number>;
    /**
     * The db node storage.
     */
    readonly dbNodeStorage?: pulumi.Input<number>;
    /**
     * The description of DBCluster.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The elastic io resource.
     */
    readonly elasticIoResource?: pulumi.Input<number>;
    /**
     * The maintenance window of the cluster. Format: hh:mmZ-hh:mmZ.
     */
    readonly maintainTime?: pulumi.Input<string>;
    /**
     * The mode of the cluster. Valid values: `reserver`, `flexible`.
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * The modify type.
     */
    readonly modifyType?: pulumi.Input<string>;
    /**
     * Field `payType` has been deprecated. New field `paymentType` instead.
     */
    readonly payType?: pulumi.Input<string>;
    /**
     * The payment type of the resource. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
     */
    readonly paymentType?: pulumi.Input<string>;
    /**
     * The duration that you will buy DB cluster (in month). It is valid when `paymentType` is `Subscription`. Valid values: [1~9], 12, 24, 36. Default to 1.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
     */
    readonly renewalStatus?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    readonly securityIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of the resource.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The vswitch id.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the resource.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DBCluster resource.
 */
export interface DBClusterArgs {
    /**
     * Auto-renewal period of an cluster, in the unit of the month. It is valid when `paymentType` is `Subscription`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`. Default to `1`.
     */
    readonly autoRenewPeriod?: pulumi.Input<number>;
    /**
     * The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [ComputeResource](https://www.alibabacloud.com/help/en/doc-detail/144851.htm)
     */
    readonly computeResource?: pulumi.Input<string>;
    /**
     * The db cluster category. Valid values: `Basic`, `Cluster`, `MixedStorage`.
     */
    readonly dbClusterCategory: pulumi.Input<string>;
    /**
     * The db cluster class. For more information, see [DBClusterClass](https://help.aliyun.com/document_detail/190519.html)
     */
    readonly dbClusterClass?: pulumi.Input<string>;
    /**
     * The db cluster version. Value options: `3.0`, Default to `3.0`.
     */
    readonly dbClusterVersion?: pulumi.Input<string>;
    /**
     * The db node class.
     */
    readonly dbNodeClass?: pulumi.Input<string>;
    /**
     * The db node count.
     */
    readonly dbNodeCount?: pulumi.Input<number>;
    /**
     * The db node storage.
     */
    readonly dbNodeStorage?: pulumi.Input<number>;
    /**
     * The description of DBCluster.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The elastic io resource.
     */
    readonly elasticIoResource?: pulumi.Input<number>;
    /**
     * The maintenance window of the cluster. Format: hh:mmZ-hh:mmZ.
     */
    readonly maintainTime?: pulumi.Input<string>;
    /**
     * The mode of the cluster. Valid values: `reserver`, `flexible`.
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * The modify type.
     */
    readonly modifyType?: pulumi.Input<string>;
    /**
     * Field `payType` has been deprecated. New field `paymentType` instead.
     */
    readonly payType?: pulumi.Input<string>;
    /**
     * The payment type of the resource. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
     */
    readonly paymentType?: pulumi.Input<string>;
    /**
     * The duration that you will buy DB cluster (in month). It is valid when `paymentType` is `Subscription`. Valid values: [1~9], 12, 24, 36. Default to 1.
     */
    readonly period?: pulumi.Input<number>;
    /**
     * Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
     */
    readonly renewalStatus?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    readonly resourceGroupId?: pulumi.Input<string>;
    /**
     * List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    readonly securityIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The vswitch id.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The zone ID of the resource.
     */
    readonly zoneId?: pulumi.Input<string>;
}