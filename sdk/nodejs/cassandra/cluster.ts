// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cassandra cluster resource supports replica set clusters only. The Cassandra provides stable, reliable, and automatic scalable database services.
 * It offers a full range of database solutions, such as disaster recovery, backup, recovery, monitoring, and alarms.
 * You can see detail product introduction [here](https://www.alibabacloud.com/help/product/49055.htm).
 *
 * > **NOTE:**  Available in 1.88.0+.
 *
 * > **NOTE:**  The following regions support create Vpc network Cassandra cluster.
 * The official website mark more regions. Or you can call [DescribeRegions](https://help.aliyun.com/document_detail/157540.html).
 *
 * > **NOTE:**  Create Cassandra cluster or change cluster type and storage would cost 30 minutes. Please make full preparation.
 *
 * ## Example Usage
 *
 * ## Import
 *
 * Cassandra cluster can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cassandra/cluster:Cluster example cds-wz9sr400dd7xxxxx
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cassandra/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when payType = PrePaid.
     */
    public readonly autoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
     */
    public readonly autoRenewPeriod!: pulumi.Output<number | undefined>;
    /**
     * Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     */
    public readonly clusterName!: pulumi.Output<string | undefined>;
    /**
     * Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     */
    public readonly dataCenterName!: pulumi.Output<string | undefined>;
    /**
     * User-defined Cassandra dataCenter-1 one node's storage space.Unit: GB. Value range:
     * - Custom storage space; value range: [160, 2000].
     * - 80-GB increments.
     */
    public readonly diskSize!: pulumi.Output<number | undefined>;
    /**
     * The disk type of Cassandra dataCenter-1. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
     */
    public readonly diskType!: pulumi.Output<string | undefined>;
    public readonly enablePublic!: pulumi.Output<boolean | undefined>;
    /**
     * Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * Set the instance's IP whitelist in VPC network.
     */
    public readonly ipWhite!: pulumi.Output<string>;
    /**
     * The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     */
    public readonly maintainEndTime!: pulumi.Output<string | undefined>;
    /**
     * The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     */
    public readonly maintainStartTime!: pulumi.Output<string | undefined>;
    /**
     * Cassandra major version. Now only support version `3.11`.
     */
    public readonly majorVersion!: pulumi.Output<string>;
    /**
     * The node count of Cassandra dataCenter-1 default to 2.
     */
    public readonly nodeCount!: pulumi.Output<number>;
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
     */
    public readonly payType!: pulumi.Output<string>;
    public readonly period!: pulumi.Output<number | undefined>;
    public readonly periodUnit!: pulumi.Output<string | undefined>;
    public /*out*/ readonly publicPoints!: pulumi.Output<string[]>;
    /**
     * A list of security group ids to associate with.
     *
     * > **NOTE:** Now cluster_name,data_center_name,instance_type,node_count,disk_type,disk_size,maintain_start_time,maintain_end_time,tags,ip_white,security_groups can be change. The others(auto_renew, autoRenewPeriod and so on) will be supported in the furture.
     */
    public readonly securityGroups!: pulumi.Output<string[]>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The vswitchId of dataCenter-1, can not empty.
     */
    public readonly vswitchId!: pulumi.Output<string>;
    /**
     * The Zone to launch the Cassandra cluster. If vswitchId is not empty, this zoneId can be "" or consistent.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["autoRenewPeriod"] = state ? state.autoRenewPeriod : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["dataCenterName"] = state ? state.dataCenterName : undefined;
            resourceInputs["diskSize"] = state ? state.diskSize : undefined;
            resourceInputs["diskType"] = state ? state.diskType : undefined;
            resourceInputs["enablePublic"] = state ? state.enablePublic : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["ipWhite"] = state ? state.ipWhite : undefined;
            resourceInputs["maintainEndTime"] = state ? state.maintainEndTime : undefined;
            resourceInputs["maintainStartTime"] = state ? state.maintainStartTime : undefined;
            resourceInputs["majorVersion"] = state ? state.majorVersion : undefined;
            resourceInputs["nodeCount"] = state ? state.nodeCount : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["payType"] = state ? state.payType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["periodUnit"] = state ? state.periodUnit : undefined;
            resourceInputs["publicPoints"] = state ? state.publicPoints : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.instanceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceType'");
            }
            if ((!args || args.majorVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'majorVersion'");
            }
            if ((!args || args.nodeCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeCount'");
            }
            if ((!args || args.payType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'payType'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["autoRenewPeriod"] = args ? args.autoRenewPeriod : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["dataCenterName"] = args ? args.dataCenterName : undefined;
            resourceInputs["diskSize"] = args ? args.diskSize : undefined;
            resourceInputs["diskType"] = args ? args.diskType : undefined;
            resourceInputs["enablePublic"] = args ? args.enablePublic : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["ipWhite"] = args ? args.ipWhite : undefined;
            resourceInputs["maintainEndTime"] = args ? args.maintainEndTime : undefined;
            resourceInputs["maintainStartTime"] = args ? args.maintainStartTime : undefined;
            resourceInputs["majorVersion"] = args ? args.majorVersion : undefined;
            resourceInputs["nodeCount"] = args ? args.nodeCount : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["payType"] = args ? args.payType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["periodUnit"] = args ? args.periodUnit : undefined;
            resourceInputs["securityGroups"] = args ? args.securityGroups : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["publicPoints"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when payType = PrePaid.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
     */
    autoRenewPeriod?: pulumi.Input<number>;
    /**
     * Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     */
    dataCenterName?: pulumi.Input<string>;
    /**
     * User-defined Cassandra dataCenter-1 one node's storage space.Unit: GB. Value range:
     * - Custom storage space; value range: [160, 2000].
     * - 80-GB increments.
     */
    diskSize?: pulumi.Input<number>;
    /**
     * The disk type of Cassandra dataCenter-1. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
     */
    diskType?: pulumi.Input<string>;
    enablePublic?: pulumi.Input<boolean>;
    /**
     * Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * Set the instance's IP whitelist in VPC network.
     */
    ipWhite?: pulumi.Input<string>;
    /**
     * The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     */
    maintainEndTime?: pulumi.Input<string>;
    /**
     * The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     */
    maintainStartTime?: pulumi.Input<string>;
    /**
     * Cassandra major version. Now only support version `3.11`.
     */
    majorVersion?: pulumi.Input<string>;
    /**
     * The node count of Cassandra dataCenter-1 default to 2.
     */
    nodeCount?: pulumi.Input<number>;
    password?: pulumi.Input<string>;
    /**
     * The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
     */
    payType?: pulumi.Input<string>;
    period?: pulumi.Input<number>;
    periodUnit?: pulumi.Input<string>;
    publicPoints?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of security group ids to associate with.
     *
     * > **NOTE:** Now cluster_name,data_center_name,instance_type,node_count,disk_type,disk_size,maintain_start_time,maintain_end_time,tags,ip_white,security_groups can be change. The others(auto_renew, autoRenewPeriod and so on) will be supported in the furture.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The vswitchId of dataCenter-1, can not empty.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The Zone to launch the Cassandra cluster. If vswitchId is not empty, this zoneId can be "" or consistent.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when payType = PrePaid.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
     */
    autoRenewPeriod?: pulumi.Input<number>;
    /**
     * Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
     */
    dataCenterName?: pulumi.Input<string>;
    /**
     * User-defined Cassandra dataCenter-1 one node's storage space.Unit: GB. Value range:
     * - Custom storage space; value range: [160, 2000].
     * - 80-GB increments.
     */
    diskSize?: pulumi.Input<number>;
    /**
     * The disk type of Cassandra dataCenter-1. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
     */
    diskType?: pulumi.Input<string>;
    enablePublic?: pulumi.Input<boolean>;
    /**
     * Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
     */
    instanceType: pulumi.Input<string>;
    /**
     * Set the instance's IP whitelist in VPC network.
     */
    ipWhite?: pulumi.Input<string>;
    /**
     * The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     */
    maintainEndTime?: pulumi.Input<string>;
    /**
     * The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
     */
    maintainStartTime?: pulumi.Input<string>;
    /**
     * Cassandra major version. Now only support version `3.11`.
     */
    majorVersion: pulumi.Input<string>;
    /**
     * The node count of Cassandra dataCenter-1 default to 2.
     */
    nodeCount: pulumi.Input<number>;
    password?: pulumi.Input<string>;
    /**
     * The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
     */
    payType: pulumi.Input<string>;
    period?: pulumi.Input<number>;
    periodUnit?: pulumi.Input<string>;
    /**
     * A list of security group ids to associate with.
     *
     * > **NOTE:** Now cluster_name,data_center_name,instance_type,node_count,disk_type,disk_size,maintain_start_time,maintain_end_time,tags,ip_white,security_groups can be change. The others(auto_renew, autoRenewPeriod and so on) will be supported in the furture.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The vswitchId of dataCenter-1, can not empty.
     */
    vswitchId: pulumi.Input<string>;
    /**
     * The Zone to launch the Cassandra cluster. If vswitchId is not empty, this zoneId can be "" or consistent.
     */
    zoneId?: pulumi.Input<string>;
}
