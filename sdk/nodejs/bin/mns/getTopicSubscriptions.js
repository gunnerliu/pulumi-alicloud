"use strict";
// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***
Object.defineProperty(exports, "__esModule", { value: true });
const pulumi = require("@pulumi/pulumi");
/**
 * This data source provides a list of MNS topic subscriptions in an Alibaba Cloud account according to the specified parameters.
 */
function getTopicSubscriptions(args, opts) {
    return pulumi.runtime.invoke("alicloud:mns/getTopicSubscriptions:getTopicSubscriptions", {
        "namePrefix": args.namePrefix,
        "outputFile": args.outputFile,
        "topicName": args.topicName,
    }, opts);
}
exports.getTopicSubscriptions = getTopicSubscriptions;
//# sourceMappingURL=getTopicSubscriptions.js.map