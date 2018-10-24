"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides a CEN child instance attachment resource.
 */
class InstanceAttachment extends pulumi.CustomResource {
    /**
     * Get an existing InstanceAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new InstanceAttachment(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["childInstanceId"] = state ? state.childInstanceId : undefined;
            inputs["childInstanceRegionId"] = state ? state.childInstanceRegionId : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
        }
        else {
            const args = argsOrState;
            if (!args || args.childInstanceId === undefined) {
                throw new Error("Missing required property 'childInstanceId'");
            }
            if (!args || args.childInstanceRegionId === undefined) {
                throw new Error("Missing required property 'childInstanceRegionId'");
            }
            if (!args || args.instanceId === undefined) {
                throw new Error("Missing required property 'instanceId'");
            }
            inputs["childInstanceId"] = args ? args.childInstanceId : undefined;
            inputs["childInstanceRegionId"] = args ? args.childInstanceRegionId : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
        }
        super("alicloud:cen/instanceAttachment:InstanceAttachment", name, inputs, opts);
    }
}
exports.InstanceAttachment = InstanceAttachment;
//# sourceMappingURL=instanceAttachment.js.map