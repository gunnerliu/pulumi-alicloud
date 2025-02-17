// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Vpc Peer Connection Accepter resource.
 *
 * For information about Vpc Peer Connection Accepter and how to use it, see [What is Peer Connection Accepter](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/AcceptVpcPeerConnection).
 *
 * > **NOTE:** Available since v1.196.0.
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
 * const name = config.get("name") || "tf-example";
 * const acceptingRegion = config.get("acceptingRegion") || "cn-beijing";
 * const acceptUid = config.get("acceptUid") || "xxxx";
 * // Method 1: Use assume_role to operate resources in the target account, detail see https://registry.terraform.io/providers/aliyun/alicloud/latest/docs#assume-role
 * const accepting = new alicloud.Provider("accepting", {
 *     region: acceptingRegion,
 *     assumeRole: {
 *         roleArn: `acs:ram::${acceptUid}:role/terraform-example-assume-role`,
 *     },
 * });
 * // Method 2: Use the target account's access_key, secret_key
 * // provider "alicloud" {
 * //   region     = "cn-hangzhou"
 * //   access_key = "access_key"
 * //   secret_key = "secret_key"
 * //   alias      = "accepting"
 * // }
 * const local = new alicloud.Provider("local", {region: "cn-hangzhou"});
 * const localNetwork = new alicloud.vpc.Network("localNetwork", {
 *     vpcName: name,
 *     cidrBlock: "10.4.0.0/16",
 * }, {
 *     provider: alicloud.local,
 * });
 * const acceptingNetwork = new alicloud.vpc.Network("acceptingNetwork", {
 *     vpcName: name,
 *     cidrBlock: "192.168.0.0/16",
 * }, {
 *     provider: alicloud.accepting,
 * });
 * const acceptingAccount = alicloud.getAccount({});
 * const defaultPeerConnection = new alicloud.vpc.PeerConnection("defaultPeerConnection", {
 *     peerConnectionName: name,
 *     vpcId: localNetwork.id,
 *     acceptingAliUid: acceptingAccount.then(acceptingAccount => acceptingAccount.id),
 *     acceptingRegionId: acceptingRegion,
 *     acceptingVpcId: acceptingNetwork.id,
 *     description: name,
 * }, {
 *     provider: alicloud.local,
 * });
 * const defaultPeerConnectionAccepter = new alicloud.vpc.PeerConnectionAccepter("defaultPeerConnectionAccepter", {instanceId: defaultPeerConnection.id}, {
 *     provider: alicloud.accepting,
 * });
 * ```
 *
 * ## Import
 *
 * Vpc Peer Connection Accepter can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter example <id>
 * ```
 */
export class PeerConnectionAccepter extends pulumi.CustomResource {
    /**
     * Get an existing PeerConnectionAccepter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PeerConnectionAccepterState, opts?: pulumi.CustomResourceOptions): PeerConnectionAccepter {
        return new PeerConnectionAccepter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter';

    /**
     * Returns true if the given object is an instance of PeerConnectionAccepter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PeerConnectionAccepter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PeerConnectionAccepter.__pulumiType;
    }

    /**
     * The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.> If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
     */
    public /*out*/ readonly acceptingOwnerUid!: pulumi.Output<number>;
    /**
     * The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
     */
    public /*out*/ readonly acceptingRegionId!: pulumi.Output<string>;
    /**
     * The VPC ID of the receiving end of the VPC peer connection.
     */
    public /*out*/ readonly acceptingVpcId!: pulumi.Output<string>;
    /**
     * The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
     */
    public /*out*/ readonly bandwidth!: pulumi.Output<number>;
    /**
     * The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
     */
    public /*out*/ readonly description!: pulumi.Output<string>;
    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the instance of the created VPC peer connection.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The name of the resource
     */
    public /*out*/ readonly peerConnectionAccepterName!: pulumi.Output<string>;
    /**
     * The status of the resource
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * You must create a VPC ID on the initiator of a VPC peer connection.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a PeerConnectionAccepter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PeerConnectionAccepterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PeerConnectionAccepterArgs | PeerConnectionAccepterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PeerConnectionAccepterState | undefined;
            resourceInputs["acceptingOwnerUid"] = state ? state.acceptingOwnerUid : undefined;
            resourceInputs["acceptingRegionId"] = state ? state.acceptingRegionId : undefined;
            resourceInputs["acceptingVpcId"] = state ? state.acceptingVpcId : undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["peerConnectionAccepterName"] = state ? state.peerConnectionAccepterName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as PeerConnectionAccepterArgs | undefined;
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["acceptingOwnerUid"] = undefined /*out*/;
            resourceInputs["acceptingRegionId"] = undefined /*out*/;
            resourceInputs["acceptingVpcId"] = undefined /*out*/;
            resourceInputs["bandwidth"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["peerConnectionAccepterName"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["vpcId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PeerConnectionAccepter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PeerConnectionAccepter resources.
 */
export interface PeerConnectionAccepterState {
    /**
     * The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.> If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
     */
    acceptingOwnerUid?: pulumi.Input<number>;
    /**
     * The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
     */
    acceptingRegionId?: pulumi.Input<string>;
    /**
     * The VPC ID of the receiving end of the VPC peer connection.
     */
    acceptingVpcId?: pulumi.Input<string>;
    /**
     * The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
     */
    description?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The ID of the instance of the created VPC peer connection.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The name of the resource
     */
    peerConnectionAccepterName?: pulumi.Input<string>;
    /**
     * The status of the resource
     */
    status?: pulumi.Input<string>;
    /**
     * You must create a VPC ID on the initiator of a VPC peer connection.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PeerConnectionAccepter resource.
 */
export interface PeerConnectionAccepterArgs {
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The ID of the instance of the created VPC peer connection.
     */
    instanceId: pulumi.Input<string>;
}
