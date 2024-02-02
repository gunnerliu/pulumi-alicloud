// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource will help you to bind a VPC to an OTS instance.
 *
 * > **NOTE:** Available since v1.10.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const defaultRandomInteger = new random.RandomInteger("defaultRandomInteger", {
 *     min: 10000,
 *     max: 99999,
 * });
 * const defaultInstance = new alicloud.ots.Instance("defaultInstance", {
 *     description: name,
 *     accessedBy: "Vpc",
 *     tags: {
 *         Created: "TF",
 *         For: "example",
 *     },
 * });
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {
 *     vpcName: name,
 *     cidrBlock: "10.4.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vswitchName: name,
 *     cidrBlock: "10.4.0.0/24",
 *     vpcId: defaultNetwork.id,
 *     zoneId: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 * });
 * const defaultInstanceAttachment = new alicloud.ots.InstanceAttachment("defaultInstanceAttachment", {
 *     instanceName: defaultInstance.name,
 *     vpcName: "examplename",
 *     vswitchId: defaultSwitch.id,
 * });
 * ```
 */
export class InstanceAttachment extends pulumi.CustomResource {
    /**
     * Get an existing InstanceAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceAttachmentState, opts?: pulumi.CustomResourceOptions): InstanceAttachment {
        return new InstanceAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ots/instanceAttachment:InstanceAttachment';

    /**
     * Returns true if the given object is an instance of InstanceAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceAttachment.__pulumiType;
    }

    /**
     * The name of the OTS instance.
     */
    public readonly instanceName!: pulumi.Output<string>;
    /**
     * The ID of attaching VPC to instance.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;
    /**
     * The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
     */
    public readonly vpcName!: pulumi.Output<string>;
    /**
     * The ID of attaching VSwitch to instance.
     */
    public readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a InstanceAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceAttachmentArgs | InstanceAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceAttachmentState | undefined;
            resourceInputs["instanceName"] = state ? state.instanceName : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vpcName"] = state ? state.vpcName : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as InstanceAttachmentArgs | undefined;
            if ((!args || args.instanceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceName'");
            }
            if ((!args || args.vpcName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcName'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["instanceName"] = args ? args.instanceName : undefined;
            resourceInputs["vpcName"] = args ? args.vpcName : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["vpcId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceAttachment resources.
 */
export interface InstanceAttachmentState {
    /**
     * The name of the OTS instance.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * The ID of attaching VPC to instance.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
     */
    vpcName?: pulumi.Input<string>;
    /**
     * The ID of attaching VSwitch to instance.
     */
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceAttachment resource.
 */
export interface InstanceAttachmentArgs {
    /**
     * The name of the OTS instance.
     */
    instanceName: pulumi.Input<string>;
    /**
     * The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
     */
    vpcName: pulumi.Input<string>;
    /**
     * The ID of attaching VSwitch to instance.
     */
    vswitchId: pulumi.Input<string>;
}
