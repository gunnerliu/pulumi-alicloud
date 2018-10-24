"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * This data source provides a list of KMS keys in an Alibaba Cloud account according to the specified filters.
 */
function getKeys(args, opts) {
    args = args || {};
    return pulumi.runtime.invoke("alicloud:kms/getKeys:getKeys", {
        "descriptionRegex": args.descriptionRegex,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}
exports.getKeys = getKeys;
//# sourceMappingURL=getKeys.js.map