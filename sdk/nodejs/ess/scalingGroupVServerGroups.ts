// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Attaches/Detaches vserver groups to a specified scaling group.
 *
 * > **NOTE:** The load balancer of which vserver groups belongs to must be in `active` status.
 *
 * > **NOTE:** If scaling group's network type is `VPC`, the vserver groups must be in the same `VPC`.
 *
 * > **NOTE:** A scaling group can have at most 5 vserver groups attached by default.
 *
 * > **NOTE:** Vserver groups and the default group of loadbalancer share the same backend server quota.
 *
 * > **NOTE:** When attach vserver groups to scaling group, existing ECS instances will be added to vserver groups; Instead, ECS instances will be removed from vserver group when detach.
 *
 * > **NOTE:** Detach action will be executed before attach action.
 *
 * > **NOTE:** Vserver group is defined uniquely by `loadbalancerId`, `vserverGroupId`, `port`.
 *
 * > **NOTE:** Modifing `weight` attribute means detach vserver group first and then, attach with new weight parameter.
 *
 * > **NOTE:** Resource `alicloud.ess.ScalingGroupVServerGroups` is available in 1.53.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "testAccEssVserverGroupsAttachment";
 * const defaultZones = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {cidrBlock: "172.16.0.0/16"});
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones[0].id),
 * });
 * const defaultLoadBalancer = new alicloud.slb.LoadBalancer("defaultLoadBalancer", {vswitchId: defaultSwitch.id});
 * const defaultServerGroup = new alicloud.slb.ServerGroup("defaultServerGroup", {loadBalancerId: defaultLoadBalancer.id});
 * const defaultListener: alicloud.slb.Listener[];
 * for (const range = {value: 0}; range.value < 2; range.value++) {
 *     defaultListener.push(new alicloud.slb.Listener(`defaultListener-${range.value}`, {
 *         loadBalancerId: [defaultLoadBalancer].map(__item => __item.id)[range.value],
 *         backendPort: "22",
 *         frontendPort: "22",
 *         protocol: "tcp",
 *         bandwidth: "10",
 *         healthCheckType: "tcp",
 *     }));
 * }
 * const defaultScalingGroup = new alicloud.ess.ScalingGroup("defaultScalingGroup", {
 *     minSize: "2",
 *     maxSize: "2",
 *     scalingGroupName: name,
 *     vswitchIds: [defaultSwitch.id],
 * });
 * const defaultScalingGroupVServerGroups = new alicloud.ess.ScalingGroupVServerGroups("defaultScalingGroupVServerGroups", {
 *     scalingGroupId: defaultScalingGroup.id,
 *     vserverGroups: [{
 *         loadbalancerId: defaultLoadBalancer.id,
 *         vserverAttributes: [{
 *             vserverGroupId: defaultServerGroup.id,
 *             port: "100",
 *             weight: "60",
 *         }],
 *     }],
 * });
 * ```
 * ## Block vserverGroup
 *
 * the vserverGroup supports the following:
 *
 * * `loadbalancerId` - (Required) Loadbalancer server ID of VServer Group.
 * * `vserverAttributes` - (Required) A list of VServer Group attributes. See Block vserverAttribute below for details.
 *
 * ## Block vserverAttribute
 *
 * * `vserverGroupId` - (Required) ID of VServer Group.
 * * `port` - (Required) - The port will be used for VServer Group backend server.
 * * `weight` - (Required) The weight of an ECS instance attached to the VServer Group.
 *
 * ## Import
 *
 * ESS vserver groups can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups example abc123456
 * ```
 */
export class ScalingGroupVServerGroups extends pulumi.CustomResource {
    /**
     * Get an existing ScalingGroupVServerGroups resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScalingGroupVServerGroupsState, opts?: pulumi.CustomResourceOptions): ScalingGroupVServerGroups {
        return new ScalingGroupVServerGroups(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups';

    /**
     * Returns true if the given object is an instance of ScalingGroupVServerGroups.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScalingGroupVServerGroups {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScalingGroupVServerGroups.__pulumiType;
    }

    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
     */
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * ID of the scaling group.
     */
    public readonly scalingGroupId!: pulumi.Output<string>;
    /**
     * A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
     */
    public readonly vserverGroups!: pulumi.Output<outputs.ess.ScalingGroupVServerGroupsVserverGroup[]>;

    /**
     * Create a ScalingGroupVServerGroups resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScalingGroupVServerGroupsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScalingGroupVServerGroupsArgs | ScalingGroupVServerGroupsState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ScalingGroupVServerGroupsState | undefined;
            inputs["force"] = state ? state.force : undefined;
            inputs["scalingGroupId"] = state ? state.scalingGroupId : undefined;
            inputs["vserverGroups"] = state ? state.vserverGroups : undefined;
        } else {
            const args = argsOrState as ScalingGroupVServerGroupsArgs | undefined;
            if (!args || args.scalingGroupId === undefined) {
                throw new Error("Missing required property 'scalingGroupId'");
            }
            if (!args || args.vserverGroups === undefined) {
                throw new Error("Missing required property 'vserverGroups'");
            }
            inputs["force"] = args ? args.force : undefined;
            inputs["scalingGroupId"] = args ? args.scalingGroupId : undefined;
            inputs["vserverGroups"] = args ? args.vserverGroups : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ScalingGroupVServerGroups.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScalingGroupVServerGroups resources.
 */
export interface ScalingGroupVServerGroupsState {
    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * ID of the scaling group.
     */
    readonly scalingGroupId?: pulumi.Input<string>;
    /**
     * A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
     */
    readonly vserverGroups?: pulumi.Input<pulumi.Input<inputs.ess.ScalingGroupVServerGroupsVserverGroup>[]>;
}

/**
 * The set of arguments for constructing a ScalingGroupVServerGroups resource.
 */
export interface ScalingGroupVServerGroupsArgs {
    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
     */
    readonly force?: pulumi.Input<boolean>;
    /**
     * ID of the scaling group.
     */
    readonly scalingGroupId: pulumi.Input<string>;
    /**
     * A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
     */
    readonly vserverGroups: pulumi.Input<pulumi.Input<inputs.ess.ScalingGroupVServerGroupsVserverGroup>[]>;
}
