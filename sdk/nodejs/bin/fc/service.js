"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * Provides a Alicloud Function Compute Service resource. The resource is the base of launching Function and Trigger configuration.
 *  For information about Service and how to use it, see [What is Function Compute](https://www.alibabacloud.com/help/doc-detail/52895.htm).
 *
 * -> **NOTE:** The resource requires a provider field 'account_id'. [See account_id](https://www.terraform.io/docs/providers/alicloud/index.html#account_id).
 *
 * -> **NOTE:** If you happen the error "Argument 'internetAccess' is not supported", you need to log on web console and click button "Apply VPC Function"
 * which is in the upper of [Function Service Web Console](https://fc.console.aliyun.com/) page.
 */
class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name, id, state) {
        return new Service(name, state, { id });
    }
    constructor(name, argsOrState, opts) {
        let inputs = {};
        if (opts && opts.id) {
            const state = argsOrState;
            inputs["description"] = state ? state.description : undefined;
            inputs["internetAccess"] = state ? state.internetAccess : undefined;
            inputs["lastModified"] = state ? state.lastModified : undefined;
            inputs["logConfig"] = state ? state.logConfig : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namePrefix"] = state ? state.namePrefix : undefined;
            inputs["role"] = state ? state.role : undefined;
            inputs["vpcConfig"] = state ? state.vpcConfig : undefined;
        }
        else {
            const args = argsOrState;
            inputs["description"] = args ? args.description : undefined;
            inputs["internetAccess"] = args ? args.internetAccess : undefined;
            inputs["logConfig"] = args ? args.logConfig : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namePrefix"] = args ? args.namePrefix : undefined;
            inputs["role"] = args ? args.role : undefined;
            inputs["vpcConfig"] = args ? args.vpcConfig : undefined;
            inputs["lastModified"] = undefined /*out*/;
        }
        super("alicloud:fc/service:Service", name, inputs, opts);
    }
}
exports.Service = Service;
//# sourceMappingURL=service.js.map