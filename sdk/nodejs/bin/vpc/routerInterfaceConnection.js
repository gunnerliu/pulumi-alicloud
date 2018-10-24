"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides a VPC router interface connection resource to connect two router interfaces which are in two different VPCs.
 * After that, all of the two router interfaces will be active.
 *
 * -> **NOTE:** At present, Router interface does not support changing opposite router interface, the connection delete action is only deactivating it to inactive, not modifying the connection to empty.
 *
 * -> **NOTE:** If you want to changing opposite router interface, you can delete router interface and re-build them.
 *
 * -> **NOTE:** A integrated router interface connection tunnel requires both InitiatingSide and AcceptingSide configuring opposite router interface.
 *
 * -> **NOTE:** Please remember to add a `depends_on` clause in the router interface connection from the InitiatingSide to the AcceptingSide, because the connection from the AcceptingSide to the InitiatingSide must be done first.
 */
class RouterInterfaceConnection extends pulumi.CustomResource {
    /**
     * Get an existing RouterInterfaceConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new RouterInterfaceConnection(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["interfaceId"] = state ? state.interfaceId : undefined;
            inputs["oppositeInterfaceId"] = state ? state.oppositeInterfaceId : undefined;
            inputs["oppositeInterfaceOwnerId"] = state ? state.oppositeInterfaceOwnerId : undefined;
            inputs["oppositeRouterId"] = state ? state.oppositeRouterId : undefined;
            inputs["oppositeRouterType"] = state ? state.oppositeRouterType : undefined;
        }
        else {
            const args = argsOrState;
            if (!args || args.interfaceId === undefined) {
                throw new Error("Missing required property 'interfaceId'");
            }
            if (!args || args.oppositeInterfaceId === undefined) {
                throw new Error("Missing required property 'oppositeInterfaceId'");
            }
            inputs["interfaceId"] = args ? args.interfaceId : undefined;
            inputs["oppositeInterfaceId"] = args ? args.oppositeInterfaceId : undefined;
            inputs["oppositeInterfaceOwnerId"] = args ? args.oppositeInterfaceOwnerId : undefined;
            inputs["oppositeRouterId"] = args ? args.oppositeRouterId : undefined;
            inputs["oppositeRouterType"] = args ? args.oppositeRouterType : undefined;
        }
        super("alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection", name, inputs, opts);
    }
}
exports.RouterInterfaceConnection = RouterInterfaceConnection;
//# sourceMappingURL=routerInterfaceConnection.js.map