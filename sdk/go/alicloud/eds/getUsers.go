// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Elastic Desktop Service(EDS) Users of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.142.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eds"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := eds.NewUser(ctx, "_default", &eds.UserArgs{
// 			EndUserId: pulumi.String("example_value"),
// 			Email:     pulumi.String("your_email"),
// 			Phone:     pulumi.String("your_phone"),
// 			Password:  pulumi.String("your_password"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ids, err := eds.GetUsers(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("ecdUserId1", ids.Users[0].Id)
// 		return nil
// 	})
// }
// ```
func GetUsers(ctx *pulumi.Context, args *GetUsersArgs, opts ...pulumi.InvokeOption) (*GetUsersResult, error) {
	var rv GetUsersResult
	err := ctx.Invoke("alicloud:eds/getUsers:getUsers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUsers.
type GetUsersArgs struct {
	// A list of User IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getUsers.
type GetUsersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string         `pulumi:"id"`
	Ids        []string       `pulumi:"ids"`
	OutputFile *string        `pulumi:"outputFile"`
	Status     *string        `pulumi:"status"`
	Users      []GetUsersUser `pulumi:"users"`
}

func GetUsersOutput(ctx *pulumi.Context, args GetUsersOutputArgs, opts ...pulumi.InvokeOption) GetUsersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetUsersResult, error) {
			args := v.(GetUsersArgs)
			r, err := GetUsers(ctx, &args, opts...)
			return *r, err
		}).(GetUsersResultOutput)
}

// A collection of arguments for invoking getUsers.
type GetUsersOutputArgs struct {
	// A list of User IDs.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
	// The status of the resource.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetUsersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUsersArgs)(nil)).Elem()
}

// A collection of values returned by getUsers.
type GetUsersResultOutput struct{ *pulumi.OutputState }

func (GetUsersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUsersResult)(nil)).Elem()
}

func (o GetUsersResultOutput) ToGetUsersResultOutput() GetUsersResultOutput {
	return o
}

func (o GetUsersResultOutput) ToGetUsersResultOutputWithContext(ctx context.Context) GetUsersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetUsersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetUsersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetUsersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetUsersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetUsersResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetUsersResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetUsersResultOutput) Users() GetUsersUserArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []GetUsersUser { return v.Users }).(GetUsersUserArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetUsersResultOutput{})
}
