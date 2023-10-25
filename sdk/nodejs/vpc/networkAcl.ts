// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a VPC Network Acl resource.
 * > **NOTE:** Currently, the resource are only available in Hongkong(cn-hongkong), India(ap-south-1), and Indonesia(ap-southeast-1) regions.
 *
 * For information about VPC Network Acl and how to use it, see [What is Network Acl](https://www.alibabacloud.com/help/en/ens/latest/createnetworkacl).
 *
 * > **NOTE:** Available since v1.43.0.
 *
 * ## Import
 *
 * VPC Network Acl can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/networkAcl:NetworkAcl example <id>
 * ```
 */
export class NetworkAcl extends pulumi.CustomResource {
    /**
     * Get an existing NetworkAcl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkAclState, opts?: pulumi.CustomResourceOptions): NetworkAcl {
        return new NetworkAcl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/networkAcl:NetworkAcl';

    /**
     * Returns true if the given object is an instance of NetworkAcl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkAcl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkAcl.__pulumiType;
    }

    /**
     * The creation time of the resource.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The description of the network ACL.The description must be 1 to 256 characters in length and cannot start with http:// or https.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Out direction rule information. See `egressAclEntries` below.
     */
    public readonly egressAclEntries!: pulumi.Output<outputs.vpc.NetworkAclEgressAclEntry[]>;
    /**
     * Inward direction rule information. See `ingressAclEntries` below.
     */
    public readonly ingressAclEntries!: pulumi.Output<outputs.vpc.NetworkAclIngressAclEntry[]>;
    /**
     * Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the network ACL.The name must be 1 to 128 characters in length and cannot start with http:// or https.
     */
    public readonly networkAclName!: pulumi.Output<string>;
    /**
     * The associated resource. See `resources` below.
     */
    public readonly resources!: pulumi.Output<outputs.vpc.NetworkAclResource[]>;
    /**
     * The status of the associated resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tags of this resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The ID of the associated VPC.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a NetworkAcl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkAclArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkAclArgs | NetworkAclState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkAclState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["egressAclEntries"] = state ? state.egressAclEntries : undefined;
            resourceInputs["ingressAclEntries"] = state ? state.ingressAclEntries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkAclName"] = state ? state.networkAclName : undefined;
            resourceInputs["resources"] = state ? state.resources : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as NetworkAclArgs | undefined;
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["egressAclEntries"] = args ? args.egressAclEntries : undefined;
            resourceInputs["ingressAclEntries"] = args ? args.ingressAclEntries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkAclName"] = args ? args.networkAclName : undefined;
            resourceInputs["resources"] = args ? args.resources : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkAcl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkAcl resources.
 */
export interface NetworkAclState {
    /**
     * The creation time of the resource.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The description of the network ACL.The description must be 1 to 256 characters in length and cannot start with http:// or https.
     */
    description?: pulumi.Input<string>;
    /**
     * Out direction rule information. See `egressAclEntries` below.
     */
    egressAclEntries?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclEgressAclEntry>[]>;
    /**
     * Inward direction rule information. See `ingressAclEntries` below.
     */
    ingressAclEntries?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclIngressAclEntry>[]>;
    /**
     * Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the network ACL.The name must be 1 to 128 characters in length and cannot start with http:// or https.
     */
    networkAclName?: pulumi.Input<string>;
    /**
     * The associated resource. See `resources` below.
     */
    resources?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclResource>[]>;
    /**
     * The status of the associated resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags of this resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the associated VPC.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkAcl resource.
 */
export interface NetworkAclArgs {
    /**
     * The description of the network ACL.The description must be 1 to 256 characters in length and cannot start with http:// or https.
     */
    description?: pulumi.Input<string>;
    /**
     * Out direction rule information. See `egressAclEntries` below.
     */
    egressAclEntries?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclEgressAclEntry>[]>;
    /**
     * Inward direction rule information. See `ingressAclEntries` below.
     */
    ingressAclEntries?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclIngressAclEntry>[]>;
    /**
     * Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.122.0. New field 'network_acl_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the network ACL.The name must be 1 to 128 characters in length and cannot start with http:// or https.
     */
    networkAclName?: pulumi.Input<string>;
    /**
     * The associated resource. See `resources` below.
     */
    resources?: pulumi.Input<pulumi.Input<inputs.vpc.NetworkAclResource>[]>;
    /**
     * The tags of this resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the associated VPC.
     *
     * The following arguments will be discarded. Please use new fields as soon as possible:
     */
    vpcId: pulumi.Input<string>;
}
