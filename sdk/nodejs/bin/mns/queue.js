"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
class Queue extends pulumi.CustomResource {
    /**
     * Get an existing Queue resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new Queue(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["delaySeconds"] = state ? state.delaySeconds : undefined;
            inputs["maximumMessageSize"] = state ? state.maximumMessageSize : undefined;
            inputs["messageRetentionPeriod"] = state ? state.messageRetentionPeriod : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["pollingWaitSeconds"] = state ? state.pollingWaitSeconds : undefined;
            inputs["visibilityTimeout"] = state ? state.visibilityTimeout : undefined;
        }
        else {
            const args = argsOrState;
            inputs["delaySeconds"] = args ? args.delaySeconds : undefined;
            inputs["maximumMessageSize"] = args ? args.maximumMessageSize : undefined;
            inputs["messageRetentionPeriod"] = args ? args.messageRetentionPeriod : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["pollingWaitSeconds"] = args ? args.pollingWaitSeconds : undefined;
            inputs["visibilityTimeout"] = args ? args.visibilityTimeout : undefined;
        }
        super("alicloud:mns/queue:Queue", name, inputs, opts);
    }
}
exports.Queue = Queue;
//# sourceMappingURL=queue.js.map