// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a VPC Prefix List resource.
 *
 * For information about VPC Prefix List and how to use it, see [What is Prefix List](https://www.alibabacloud.com/help/zh/virtual-private-cloud/latest/creatvpcprefixlist).
 *
 * > **NOTE:** Available in v1.182.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.vpc.PrefixList("default", {
 *     entrys: [{
 *         cidr: "192.168.0.0/16",
 *         description: "description",
 *     }],
 *     ipVersion: "IPV4",
 *     maxEntries: 50,
 *     prefixListName: _var.name,
 *     prefixListDescription: "description",
 * });
 * ```
 *
 * ## Import
 *
 * VPC Prefix List can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/prefixList:PrefixList example <id>
 * ```
 */
export class PrefixList extends pulumi.CustomResource {
    /**
     * Get an existing PrefixList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrefixListState, opts?: pulumi.CustomResourceOptions): PrefixList {
        return new PrefixList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/prefixList:PrefixList';

    /**
     * Returns true if the given object is an instance of PrefixList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrefixList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrefixList.__pulumiType;
    }

    /**
     * The CIDR address block list of the prefix list. See the following `Block entrys`.
     */
    public readonly entrys!: pulumi.Output<outputs.vpc.PrefixListEntry[] | undefined>;
    /**
     * The IP version of the prefix list. Valid values: `IPV4`, `IPV6`.
     */
    public readonly ipVersion!: pulumi.Output<string>;
    /**
     * The maximum number of entries for CIDR address blocks in the prefix list.
     */
    public readonly maxEntries!: pulumi.Output<number>;
    /**
     * The description of the prefix list. It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     */
    public readonly prefixListDescription!: pulumi.Output<string | undefined>;
    /**
     * The name of the prefix list. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
     */
    public readonly prefixListName!: pulumi.Output<string | undefined>;
    /**
     * (Available in v1.196.0+) The status of the Prefix List.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a PrefixList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PrefixListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrefixListArgs | PrefixListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrefixListState | undefined;
            resourceInputs["entrys"] = state ? state.entrys : undefined;
            resourceInputs["ipVersion"] = state ? state.ipVersion : undefined;
            resourceInputs["maxEntries"] = state ? state.maxEntries : undefined;
            resourceInputs["prefixListDescription"] = state ? state.prefixListDescription : undefined;
            resourceInputs["prefixListName"] = state ? state.prefixListName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as PrefixListArgs | undefined;
            resourceInputs["entrys"] = args ? args.entrys : undefined;
            resourceInputs["ipVersion"] = args ? args.ipVersion : undefined;
            resourceInputs["maxEntries"] = args ? args.maxEntries : undefined;
            resourceInputs["prefixListDescription"] = args ? args.prefixListDescription : undefined;
            resourceInputs["prefixListName"] = args ? args.prefixListName : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrefixList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrefixList resources.
 */
export interface PrefixListState {
    /**
     * The CIDR address block list of the prefix list. See the following `Block entrys`.
     */
    entrys?: pulumi.Input<pulumi.Input<inputs.vpc.PrefixListEntry>[]>;
    /**
     * The IP version of the prefix list. Valid values: `IPV4`, `IPV6`.
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * The maximum number of entries for CIDR address blocks in the prefix list.
     */
    maxEntries?: pulumi.Input<number>;
    /**
     * The description of the prefix list. It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     */
    prefixListDescription?: pulumi.Input<string>;
    /**
     * The name of the prefix list. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
     */
    prefixListName?: pulumi.Input<string>;
    /**
     * (Available in v1.196.0+) The status of the Prefix List.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrefixList resource.
 */
export interface PrefixListArgs {
    /**
     * The CIDR address block list of the prefix list. See the following `Block entrys`.
     */
    entrys?: pulumi.Input<pulumi.Input<inputs.vpc.PrefixListEntry>[]>;
    /**
     * The IP version of the prefix list. Valid values: `IPV4`, `IPV6`.
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * The maximum number of entries for CIDR address blocks in the prefix list.
     */
    maxEntries?: pulumi.Input<number>;
    /**
     * The description of the prefix list. It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
     */
    prefixListDescription?: pulumi.Input<string>;
    /**
     * The name of the prefix list. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
     */
    prefixListName?: pulumi.Input<string>;
}
