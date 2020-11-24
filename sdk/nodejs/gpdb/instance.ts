// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a AnalyticDB for PostgreSQL instance resource supports replica set instances only. the AnalyticDB for PostgreSQL provides stable, reliable, and automatic scalable database services.
 * You can see detail product introduction [here](https://www.alibabacloud.com/help/doc-detail/35387.htm)
 *
 * > **NOTE:**  Available in 1.47.0+
 *
 * > **NOTE:**  The following regions don't support create Classic network Gpdb instance.
 * [`ap-southeast-2`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`me-east-1`,`ap-northeast-1`,`eu-west-1`,`us-east-1`,`eu-central-1`,`cn-shanghai-finance-1`,`cn-shenzhen-finance-1`,`cn-hangzhou-finance`]
 *
 * > **NOTE:**  Create instance or change instance would cost 10~15 minutes. Please make full preparation.
 *
 * ## Example Usage
 * ### Create a Gpdb instance
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "Gpdb",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {cidrBlock: "172.16.0.0/16"});
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones[0].id),
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 * });
 * const example = new alicloud.gpdb.Instance("example", {
 *     description: "tf-gpdb-test",
 *     engine: "gpdb",
 *     engineVersion: "4.3",
 *     instanceClass: "gpdb.group.segsdx2",
 *     instanceGroupCount: "2",
 *     vswitchId: defaultSwitch.id,
 *     securityIpLists: [
 *         "10.168.1.12",
 *         "100.69.7.112",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * AnalyticDB for PostgreSQL can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:gpdb/instance:Instance example gp-bp1291daeda44194
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:gpdb/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    public readonly availabilityZone!: pulumi.Output<string>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Database engine: gpdb. System Default value: gpdb.
     */
    public readonly engine!: pulumi.Output<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
     */
    public readonly engineVersion!: pulumi.Output<string>;
    /**
     * Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
     */
    public readonly instanceChargeType!: pulumi.Output<string>;
    /**
     * Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
     */
    public readonly instanceClass!: pulumi.Output<string>;
    /**
     * The number of groups. Valid values: [2,4,8,16,32]
     */
    public readonly instanceGroupCount!: pulumi.Output<string>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    public readonly securityIpLists!: pulumi.Output<string[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as InstanceState | undefined;
            inputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["engine"] = state ? state.engine : undefined;
            inputs["engineVersion"] = state ? state.engineVersion : undefined;
            inputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            inputs["instanceClass"] = state ? state.instanceClass : undefined;
            inputs["instanceGroupCount"] = state ? state.instanceGroupCount : undefined;
            inputs["securityIpLists"] = state ? state.securityIpLists : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if (!args || args.instanceClass === undefined) {
                throw new Error("Missing required property 'instanceClass'");
            }
            if (!args || args.instanceGroupCount === undefined) {
                throw new Error("Missing required property 'instanceGroupCount'");
            }
            inputs["availabilityZone"] = args ? args.availabilityZone : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["engine"] = args ? args.engine : undefined;
            inputs["engineVersion"] = args ? args.engineVersion : undefined;
            inputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            inputs["instanceClass"] = args ? args.instanceClass : undefined;
            inputs["instanceGroupCount"] = args ? args.instanceGroupCount : undefined;
            inputs["securityIpLists"] = args ? args.securityIpLists : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Instance.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Database engine: gpdb. System Default value: gpdb.
     */
    readonly engine?: pulumi.Input<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
     */
    readonly engineVersion?: pulumi.Input<string>;
    /**
     * Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
     */
    readonly instanceClass?: pulumi.Input<string>;
    /**
     * The number of groups. Valid values: [2,4,8,16,32]
     */
    readonly instanceGroupCount?: pulumi.Input<string>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    readonly securityIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    readonly vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * The name of DB instance. It a string of 2 to 256 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Database engine: gpdb. System Default value: gpdb.
     */
    readonly engine?: pulumi.Input<string>;
    /**
     * Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
     */
    readonly engineVersion?: pulumi.Input<string>;
    /**
     * Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
     */
    readonly instanceChargeType?: pulumi.Input<string>;
    /**
     * Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
     */
    readonly instanceClass: pulumi.Input<string>;
    /**
     * The number of groups. Valid values: [2,4,8,16,32]
     */
    readonly instanceGroupCount: pulumi.Input<string>;
    /**
     * List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
     */
    readonly securityIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The virtual switch ID to launch DB instances in one VPC.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
