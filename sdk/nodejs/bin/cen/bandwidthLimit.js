"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides a CEN cross-regional interconnection bandwidth resource. To connect networks in different regions, you must set cross-region interconnection bandwidth after buying a bandwidth package. The total bandwidth set for all the interconnected regions of a bandwidth package cannot exceed the bandwidth of the bandwidth package. By default, 1 Kbps bandwidth is provided for connectivity test. To run normal business, you must buy a bandwidth package and set a proper interconnection bandwidth.
 *
 * For example, a CEN instance is bound to a bandwidth package of 20 Mbps and  the interconnection areas are Mainland China and North America. You can set the cross-region interconnection bandwidth between US West 1 and China East 1, China East 2, China South 1, and so on. However, the total bandwidth set for all the interconnected regions cannot exceed 20  Mbps.
 *
 * For information about CEN and how to use it, see [Cross-region interconnection bandwidth](https://www.alibabacloud.com/help/doc-detail/65983.htm)
 */
class BandwidthLimit extends pulumi.CustomResource {
    /**
     * Get an existing BandwidthLimit resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new BandwidthLimit(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["bandwidthLimit"] = state ? state.bandwidthLimit : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
            inputs["regionIds"] = state ? state.regionIds : undefined;
        }
        else {
            const args = argsOrState;
            if (!args || args.bandwidthLimit === undefined) {
                throw new Error("Missing required property 'bandwidthLimit'");
            }
            if (!args || args.instanceId === undefined) {
                throw new Error("Missing required property 'instanceId'");
            }
            if (!args || args.regionIds === undefined) {
                throw new Error("Missing required property 'regionIds'");
            }
            inputs["bandwidthLimit"] = args ? args.bandwidthLimit : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
            inputs["regionIds"] = args ? args.regionIds : undefined;
        }
        super("alicloud:cen/bandwidthLimit:BandwidthLimit", name, inputs, opts);
    }
}
exports.BandwidthLimit = BandwidthLimit;
//# sourceMappingURL=bandwidthLimit.js.map