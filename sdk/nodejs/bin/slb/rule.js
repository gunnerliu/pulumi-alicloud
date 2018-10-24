"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * A forwarding rule is configured in `HTTP`/`HTTPS` listener and it used to listen a list of backend servers which in one specified virtual backend server group.
 * You can add forwarding rules to a listener to forward requests based on the domain names or the URL in the request.
 *
 * ~> **NOTE:** One virtual backend server group can be attached in multiple forwarding rules.
 *
 * ~> **NOTE:** At least one "Domain" or "Url" must be specified when creating a new rule.
 *
 * ~> **NOTE:** Having the same 'Domain' and 'Url' rule can not be created repeatedly in the one listener.
 *
 * ~> **NOTE:** Rule only be created in the `HTTP` or `HTTPS` listener.
 *
 * ~> **NOTE:** Only rule's virtual server group can be modified.
 */
class Rule extends pulumi.CustomResource {
    /**
     * Get an existing Rule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new Rule(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["domain"] = state ? state.domain : undefined;
            inputs["frontendPort"] = state ? state.frontendPort : undefined;
            inputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["serverGroupId"] = state ? state.serverGroupId : undefined;
            inputs["url"] = state ? state.url : undefined;
        }
        else {
            const args = argsOrState;
            if (!args || args.frontendPort === undefined) {
                throw new Error("Missing required property 'frontendPort'");
            }
            if (!args || args.loadBalancerId === undefined) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            if (!args || args.serverGroupId === undefined) {
                throw new Error("Missing required property 'serverGroupId'");
            }
            inputs["domain"] = args ? args.domain : undefined;
            inputs["frontendPort"] = args ? args.frontendPort : undefined;
            inputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["serverGroupId"] = args ? args.serverGroupId : undefined;
            inputs["url"] = args ? args.url : undefined;
        }
        super("alicloud:slb/rule:Rule", name, inputs, opts);
    }
}
exports.Rule = Rule;
//# sourceMappingURL=rule.js.map