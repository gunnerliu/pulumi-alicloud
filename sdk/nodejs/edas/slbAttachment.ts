// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Binds SLB to an EDAS application.
 *
 * > **NOTE:** Available in 1.82.0+
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.edas.SlbAttachment("default", {
 *     appId: _var.app_id,
 *     slbId: _var.slb_id,
 *     slbIp: _var.slb_ip,
 *     type: _var.type,
 *     listenerPort: _var.listener_port,
 *     vserverGroupId: _var.vserver_group_id,
 * });
 * ```
 */
export class SlbAttachment extends pulumi.CustomResource {
    /**
     * Get an existing SlbAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SlbAttachmentState, opts?: pulumi.CustomResourceOptions): SlbAttachment {
        return new SlbAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:edas/slbAttachment:SlbAttachment';

    /**
     * Returns true if the given object is an instance of SlbAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SlbAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SlbAttachment.__pulumiType;
    }

    /**
     * The ID of the applicaton to which you want to bind an SLB instance.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The listening port for the bound SLB instance.
     */
    public readonly listenerPort!: pulumi.Output<number | undefined>;
    /**
     * The ID of the SLB instance that is going to be bound.
     */
    public readonly slbId!: pulumi.Output<string>;
    /**
     * The IP address that is allocated to the bound SLB instance.
     */
    public readonly slbIp!: pulumi.Output<string>;
    /**
     * Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and foward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
     */
    public /*out*/ readonly slbStatus!: pulumi.Output<string>;
    /**
     * The type of the bound SLB instance.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The ID of the virtual server (VServer) group associated with the intranet SLB instance.
     */
    public readonly vserverGroupId!: pulumi.Output<string | undefined>;
    /**
     * VPC related vswitch ID.
     */
    public /*out*/ readonly vswitchId!: pulumi.Output<string>;

    /**
     * Create a SlbAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SlbAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SlbAttachmentArgs | SlbAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as SlbAttachmentState | undefined;
            inputs["appId"] = state ? state.appId : undefined;
            inputs["listenerPort"] = state ? state.listenerPort : undefined;
            inputs["slbId"] = state ? state.slbId : undefined;
            inputs["slbIp"] = state ? state.slbIp : undefined;
            inputs["slbStatus"] = state ? state.slbStatus : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["vserverGroupId"] = state ? state.vserverGroupId : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as SlbAttachmentArgs | undefined;
            if (!args || args.appId === undefined) {
                throw new Error("Missing required property 'appId'");
            }
            if (!args || args.slbId === undefined) {
                throw new Error("Missing required property 'slbId'");
            }
            if (!args || args.slbIp === undefined) {
                throw new Error("Missing required property 'slbIp'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            inputs["appId"] = args ? args.appId : undefined;
            inputs["listenerPort"] = args ? args.listenerPort : undefined;
            inputs["slbId"] = args ? args.slbId : undefined;
            inputs["slbIp"] = args ? args.slbIp : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["vserverGroupId"] = args ? args.vserverGroupId : undefined;
            inputs["slbStatus"] = undefined /*out*/;
            inputs["vswitchId"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(SlbAttachment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SlbAttachment resources.
 */
export interface SlbAttachmentState {
    /**
     * The ID of the applicaton to which you want to bind an SLB instance.
     */
    readonly appId?: pulumi.Input<string>;
    /**
     * The listening port for the bound SLB instance.
     */
    readonly listenerPort?: pulumi.Input<number>;
    /**
     * The ID of the SLB instance that is going to be bound.
     */
    readonly slbId?: pulumi.Input<string>;
    /**
     * The IP address that is allocated to the bound SLB instance.
     */
    readonly slbIp?: pulumi.Input<string>;
    /**
     * Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and foward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
     */
    readonly slbStatus?: pulumi.Input<string>;
    /**
     * The type of the bound SLB instance.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The ID of the virtual server (VServer) group associated with the intranet SLB instance.
     */
    readonly vserverGroupId?: pulumi.Input<string>;
    /**
     * VPC related vswitch ID.
     */
    readonly vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SlbAttachment resource.
 */
export interface SlbAttachmentArgs {
    /**
     * The ID of the applicaton to which you want to bind an SLB instance.
     */
    readonly appId: pulumi.Input<string>;
    /**
     * The listening port for the bound SLB instance.
     */
    readonly listenerPort?: pulumi.Input<number>;
    /**
     * The ID of the SLB instance that is going to be bound.
     */
    readonly slbId: pulumi.Input<string>;
    /**
     * The IP address that is allocated to the bound SLB instance.
     */
    readonly slbIp: pulumi.Input<string>;
    /**
     * The type of the bound SLB instance.
     */
    readonly type: pulumi.Input<string>;
    /**
     * The ID of the virtual server (VServer) group associated with the intranet SLB instance.
     */
    readonly vserverGroupId?: pulumi.Input<string>;
}
