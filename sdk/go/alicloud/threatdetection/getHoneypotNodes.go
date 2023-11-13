// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package threatdetection

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Threat Detection Honeypot Node available to the user.[What is Honeypot Node](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypotnode)
//
// > **NOTE:** Available in 1.195.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/threatdetection"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// _default, err := threatdetection.GetHoneypotNodes(ctx, &threatdetection.GetHoneypotNodesArgs{
// Ids: interface{}{
// alicloud_threat_detection_honeypot_node.Default.Id,
// },
// }, nil);
// if err != nil {
// return err
// }
// ctx.Export("alicloudThreatDetectionHoneypotNodeExampleId", _default.Nodes[0].Id)
// return nil
// })
// }
// ```
func GetHoneypotNodes(ctx *pulumi.Context, args *GetHoneypotNodesArgs, opts ...pulumi.InvokeOption) (*GetHoneypotNodesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHoneypotNodesResult
	err := ctx.Invoke("alicloud:threatdetection/getHoneypotNodes:getHoneypotNodes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHoneypotNodes.
type GetHoneypotNodesArgs struct {
	// A list of Honeypot Node IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Honeypot Node name.
	NameRegex *string `pulumi:"nameRegex"`
	// Honeypot management node id.
	NodeId *string `pulumi:"nodeId"`
	// The name of the management node.
	NodeName *string `pulumi:"nodeName"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
}

// A collection of values returned by getHoneypotNodes.
type GetHoneypotNodesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Honeypot Node IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Honeypot Node names.
	Names []string `pulumi:"names"`
	// Honeypot management node id.
	NodeId *string `pulumi:"nodeId"`
	// Management node name.
	NodeName *string `pulumi:"nodeName"`
	// A list of Honeypot Node Entries. Each element contains the following attributes:
	Nodes      []GetHoneypotNodesNode `pulumi:"nodes"`
	OutputFile *string                `pulumi:"outputFile"`
	PageNumber *int                   `pulumi:"pageNumber"`
	PageSize   *int                   `pulumi:"pageSize"`
}

func GetHoneypotNodesOutput(ctx *pulumi.Context, args GetHoneypotNodesOutputArgs, opts ...pulumi.InvokeOption) GetHoneypotNodesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHoneypotNodesResult, error) {
			args := v.(GetHoneypotNodesArgs)
			r, err := GetHoneypotNodes(ctx, &args, opts...)
			var s GetHoneypotNodesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetHoneypotNodesResultOutput)
}

// A collection of arguments for invoking getHoneypotNodes.
type GetHoneypotNodesOutputArgs struct {
	// A list of Honeypot Node IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Honeypot Node name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// Honeypot management node id.
	NodeId pulumi.StringPtrInput `pulumi:"nodeId"`
	// The name of the management node.
	NodeName pulumi.StringPtrInput `pulumi:"nodeName"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
}

func (GetHoneypotNodesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHoneypotNodesArgs)(nil)).Elem()
}

// A collection of values returned by getHoneypotNodes.
type GetHoneypotNodesResultOutput struct{ *pulumi.OutputState }

func (GetHoneypotNodesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHoneypotNodesResult)(nil)).Elem()
}

func (o GetHoneypotNodesResultOutput) ToGetHoneypotNodesResultOutput() GetHoneypotNodesResultOutput {
	return o
}

func (o GetHoneypotNodesResultOutput) ToGetHoneypotNodesResultOutputWithContext(ctx context.Context) GetHoneypotNodesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetHoneypotNodesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Honeypot Node IDs.
func (o GetHoneypotNodesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetHoneypotNodesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Honeypot Node names.
func (o GetHoneypotNodesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

// Honeypot management node id.
func (o GetHoneypotNodesResultOutput) NodeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) *string { return v.NodeId }).(pulumi.StringPtrOutput)
}

// Management node name.
func (o GetHoneypotNodesResultOutput) NodeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) *string { return v.NodeName }).(pulumi.StringPtrOutput)
}

// A list of Honeypot Node Entries. Each element contains the following attributes:
func (o GetHoneypotNodesResultOutput) Nodes() GetHoneypotNodesNodeArrayOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) []GetHoneypotNodesNode { return v.Nodes }).(GetHoneypotNodesNodeArrayOutput)
}

func (o GetHoneypotNodesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetHoneypotNodesResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetHoneypotNodesResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetHoneypotNodesResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHoneypotNodesResultOutput{})
}
