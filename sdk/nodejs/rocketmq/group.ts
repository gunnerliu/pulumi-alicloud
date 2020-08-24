// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an ONS group resource.
 *
 * For more information about how to use it, see [RocketMQ Group Management API](https://www.alibabacloud.com/help/doc-detail/29616.html).
 *
 * > **NOTE:** Available in 1.53.0+
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
 * const name = config.get("name") || "onsInstanceName";
 * const groupId = config.get("groupId") || "GID-onsGroupDatasourceName";
 *
 * const defaultInstance = new alicloud.rocketmq.Instance("default", {
 *     remark: "default_ons_instance_remark",
 * });
 * const defaultGroup = new alicloud.rocketmq.Group("default", {
 *     groupId: groupId,
 *     instanceId: defaultInstance.id,
 *     remark: "dafault_ons_group_remark",
 * });
 * ```
 */
export class Group extends pulumi.CustomResource {
    /**
     * Get an existing Group resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupState, opts?: pulumi.CustomResourceOptions): Group {
        return new Group(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rocketmq/group:Group';

    /**
     * Returns true if the given object is an instance of Group.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Group {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Group.__pulumiType;
    }

    /**
     * Name of the group. Two groups on a single instance cannot have the same name. A `groupId` starts with "GID_" or "GID-", and contains letters, numbers, hyphens (-), and underscores (_).
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * ID of the ONS Instance that owns the groups.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
     */
    public readonly readEnable!: pulumi.Output<boolean | undefined>;
    /**
     * This attribute is a concise description of group. The length cannot exceed 256.
     */
    public readonly remark!: pulumi.Output<string | undefined>;

    /**
     * Create a Group resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupArgs | GroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as GroupState | undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
            inputs["readEnable"] = state ? state.readEnable : undefined;
            inputs["remark"] = state ? state.remark : undefined;
        } else {
            const args = argsOrState as GroupArgs | undefined;
            if (!args || args.groupId === undefined) {
                throw new Error("Missing required property 'groupId'");
            }
            if (!args || args.instanceId === undefined) {
                throw new Error("Missing required property 'instanceId'");
            }
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
            inputs["readEnable"] = args ? args.readEnable : undefined;
            inputs["remark"] = args ? args.remark : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Group.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Group resources.
 */
export interface GroupState {
    /**
     * Name of the group. Two groups on a single instance cannot have the same name. A `groupId` starts with "GID_" or "GID-", and contains letters, numbers, hyphens (-), and underscores (_).
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * ID of the ONS Instance that owns the groups.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
     */
    readonly readEnable?: pulumi.Input<boolean>;
    /**
     * This attribute is a concise description of group. The length cannot exceed 256.
     */
    readonly remark?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    /**
     * Name of the group. Two groups on a single instance cannot have the same name. A `groupId` starts with "GID_" or "GID-", and contains letters, numbers, hyphens (-), and underscores (_).
     */
    readonly groupId: pulumi.Input<string>;
    /**
     * ID of the ONS Instance that owns the groups.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
     */
    readonly readEnable?: pulumi.Input<boolean>;
    /**
     * This attribute is a concise description of group. The length cannot exceed 256.
     */
    readonly remark?: pulumi.Input<string>;
}
